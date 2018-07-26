package BilderPizza;

public class Drink implements Item{

    private String name;
    private final Size size;
    private float price;

    public Drink(String name, Size size, float price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public float price() {
        return price;
    }
}
