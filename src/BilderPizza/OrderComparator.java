package BilderPizza;

import java.util.Comparator;

public abstract class OrderComparator implements Comparator {

    public static Comparator<Order>byName(){
        return new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }

    public static Comparator<Order> byPrice (){
        return new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return Double.compare(o1.getPrice(),o2.getPrice());
            }
        };
    }

    public  static Comparator<Order>byPayedTime(){
        return new Comparator<Order>(){
            @Override
            public int compare(Order o1, Order o2) {
                return o1.getPayedTime().compareTo(o2.getPayedTime());
            }
        };
    }


}

