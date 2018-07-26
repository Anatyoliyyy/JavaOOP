package Lesson4.HomeWorke.Task2Messenger;

public class PlainText implements Text {

    private final String content;

    public PlainText(String content) {
        this.content = content;
    }

    public String getText() {
        return content;
    }
}
