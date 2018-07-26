package Lesson11.multithreading2.shared_resource.chatroom;

class Sender implements Runnable {

    private final ChatRoom chatRoom;
    private final String message;

    public Sender(ChatRoom chatRoom, String message) {
        this.chatRoom = chatRoom;
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            chatRoom.send(message);
        }
    }
}