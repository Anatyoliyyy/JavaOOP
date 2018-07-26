package BilderPizza;

public class Toppings {
    private String name;
    private float price;

    public Toppings(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "name='" + name + '\'' +
                '}';
    }
}
