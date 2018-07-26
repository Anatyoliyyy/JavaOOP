package Lesson11.multithreading2.shared_resource.chatroom;

import Lesson11.multithreading2.annotations.GuardedBy;
import Lesson11.multithreading2.annotations.ThreadSafe;

@ThreadSafe
public class ChatRoomWithSynchronizedBlock implements ChatRoom {

    @GuardedBy("itself")
    private final StringBuilder room = new StringBuilder(); // unsafe resource

    @Override
    public void send(String message) {
        synchronized (room) {
            room.append(message + "\n"); // ok
        }
    }

    @Override
    public String getContent() {
        synchronized (room) {
            return room.toString(); // ok
        }
    }
}
