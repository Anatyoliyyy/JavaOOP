package Lesson6.enum_example;

public class EnumExample {

    public static void main(String[] args) {
        Genre g1 = Genre.COMEDY;

        // enum -> String
        String name = g1.name();
        System.out.println("name = " + name);

        // enum -> int
        int ordinal = g1.ordinal();
        System.out.println("ordinal = " + ordinal);

        // String -> name
        Genre g2 = Genre.valueOf("ACTION");
        System.out.println(g2);

        // int -> enum
        Genre[] genres = Genre.values();
        Genre g3 = genres[2];
        System.out.println(g3);

        System.out.println(Genre.COMEDY == Genre.COMEDY);

        System.out.println(Genre.ACTION.shortName());
    }
}