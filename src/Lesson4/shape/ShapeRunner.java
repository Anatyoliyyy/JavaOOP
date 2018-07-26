package Lesson4.shape;

import java.util.ArrayList;

public class ShapeRunner {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        System.out.println(r.getArea()); // 200

        Circle c = new Circle(10);
        System.out.println(c.getArea()); // 314

        Shape s = new Rectangle(10, 30);
        System.out.println(s.getArea()); // 200

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10));
        shapes.add(new Rectangle(10, 20));

        double sumArea = sumArea(shapes);
        System.out.println("sumArea = " + sumArea);

        Shape shape = shapes.get(0);
        if (shape instanceof Rectangle) { // BAD PRACTICE
            Rectangle rectangle = (Rectangle) shape;
            System.out.println(rectangle.getWidth()); // BAD PRACTICE
        } else {
            System.out.println("Sorry, illegal shape (not rectangle)");
        }
    }

    private static double sumArea(ArrayList<Shape> shapes) {
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.getArea();
        }
        return sumArea;
    }
}
