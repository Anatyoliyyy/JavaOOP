package Lesson2.post;

public class Post {

    // Fields

    private final String author;
    private final String content;
    private long likes;

    // Constructors

    public Post(String author, String content, long likes) {
        checkLikes(likes);
        this.author = author;
        this.content = content;
        this.likes = likes;
    }

    private void checkLikes(long likes) {
        if (likes < 0) {
            throw new IllegalArgumentException("negative likes: " + likes);
        }
    }

    public Post(String author, String content) {
        this(author, content, 0);
    }

    // Interface + Implementation

    public void like() {
        likes++;
    }

    public String show() {
        return "\"" + content + "\" by " + author + ", "
                + likes + " likes";
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public long getLikes() {
        return likes;
    }

    public String toString() {
        return "Post{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                '}';
    }

}
