package Lesson11.multithreading2.shared_resource.chatroom;

import Lesson11.multithreading2.annotations.NotThreadSafe;

@NotThreadSafe
public class UnsafeChatRoom implements ChatRoom {

    private final StringBuilder room = new StringBuilder(); // unsafe resource

    @Override
    public void send(String message) {
        room.append(message + "\n"); // problem
    }

    @Override
    public String getContent() {
        return room.toString(); // problem
    }
}