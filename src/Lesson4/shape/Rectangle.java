package Lesson4.shape;

public class Rectangle implements Shape, Printable {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width <= 0) {
            throw new IllegalArgumentException("width should be > 0: " + width);
        }
        if (height <= 0) {
            throw new IllegalArgumentException("height should be > 0: " + height);
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void printIntoConsole() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
