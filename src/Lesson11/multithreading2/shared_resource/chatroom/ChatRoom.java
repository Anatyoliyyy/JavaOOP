package Lesson11.multithreading2.shared_resource.chatroom;

public interface ChatRoom {
    void send(String message);
    String getContent();
}