package Lesson11.multithreading2.shared_resource.chatroom;

import Lesson11.multithreading2.annotations.GuardedBy;
import Lesson11.multithreading2.annotations.ThreadSafe;

@ThreadSafe
public class SafeChatRoom implements ChatRoom {

    @GuardedBy("this")
    private final StringBuilder room = new StringBuilder(); // unsafe resource

    @Override
    public synchronized void send(String message) {
        room.append(message + "\n"); // ok
    }

    @Override
    public synchronized String getContent() {
        return room.toString(); // ok
    }
}