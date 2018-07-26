package Lesson2.post;

public class PostRunner {

    public static void main(String[] args) {
        Post p1 = new Post("@s_vakarchuk", "Слава Україні", 350);
        Post p2 = new Post("@elonmusk", "Tesla Superchargers");

        p2.like();
        p2.like();
        p2.like();

        System.out.println(p1.show());
        System.out.println(p2.show());

        System.out.println(p1);
    }
}
