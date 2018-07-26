package BilderPizza;

public class Pizza implements Item {

    @Override
    public String name() {
        return name;
    }

    @Override
    public float price() {
        return price;
    }

    private String name;
    private final Size size;
    private float price;

    public Pizza(String name, Size size, float price) {
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
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }


}

