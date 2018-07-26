package Lesson4.shape;

public class Example {

    public static void main(String[] args) {
        Printable x = new Rectangle(10.0, 20.0);

//        printShapeInfo(new Rectangle(10.0, 40.0));
        printShapeInfo(new Circle(10.0));
    }

    public static void printShapeInfo(NameableShape s) {
        System.out.println("name = " + s.getName());
        System.out.println("S = " + s.getArea());
        System.out.println("P = " + s.getPerimeter());
    }
}
