package BilderPizza;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable{
    private String name;
    private List<Item> order = new ArrayList<>();
    private LocalDateTime PayedTime;
    private final int distance;

    public Order(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getPayedTime() {
        return PayedTime;
    }

    public void setPayedTime(LocalDateTime payedTime) {
        PayedTime = payedTime;
    }

    public List<Item> getOrder() {
        return order;
    }

    public void addItem(Item item){
        order.add(item);
    }

    public float getPrice(){
        float price=0;
        for(Item item:order){
            price=price+item.price();
        }
        return price;
    }

    public float PriceWithDelivery(){
        if (distance<0) throw new IllegalArgumentException("distnce can't be <0" + distance);
        float PriceWithDelivery = 0;

        if(distance>0 && distance<5){
            PriceWithDelivery= (float) (getPrice()+PriceWithDelivery+distance*0.3);}
        else if (distance>=6 && distance<12){
            PriceWithDelivery=(float) (getPrice()+PriceWithDelivery+distance*0.5);}
        else {
            PriceWithDelivery= (float) (getPrice()+PriceWithDelivery+distance*0.7);}

        return PriceWithDelivery;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", order=" + order +
                ", PayedTime=" + PayedTime +
                "}\n";
    }
}

