package BilderPizza;

import java.util.ArrayList;
import java.util.List;

public class CreatePizza implements Item {

    private String name;
    private final Size size;
    private final  List<Toppings> toppings=new ArrayList<>();


    public CreatePizza(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String name() {
        return "Own pizza";
    }

    public void addToppings(Toppings topping){
        toppings.add(topping);
    }


    @Override
    public float price() {
        float priceForCreatePizza=0;
        for (Toppings toppings:toppings){
            priceForCreatePizza=priceForCreatePizza+toppings.getPrice();
        }
        switch (getSize()){
            case LITTLE:
                return 5+priceForCreatePizza;
            case MIDDLE:
                return 7+priceForCreatePizza;
            case BIG:
                return 9+priceForCreatePizza;
            default:
                throw new IllegalArgumentException("No exist size" + getSize());

        }

    }

    @Override
    public String toString() {
        return "\nCreatePizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}
