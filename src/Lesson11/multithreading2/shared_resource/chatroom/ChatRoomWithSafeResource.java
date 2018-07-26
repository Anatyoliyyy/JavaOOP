package Lesson11.multithreading2.shared_resource.chatroom;

import Lesson11.multithreading2.annotations.ThreadSafe;

@ThreadSafe
public class ChatRoomWithSafeResource implements ChatRoom {

    private final StringBuffer room = new StringBuffer(); // safe resource

    @Override
    public void send(String message) {
        room.append(message + "\n"); // ok
    }

    @Override
    public String getContent() {
        return room.toString(); // ok
    }
}