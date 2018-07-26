package BilderPizza;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Predicate;

public abstract class filter implements Predicate<Order>{
    public static Predicate<Order>nameContaince(String Substring){
        return new Predicate<Order>() {
            @Override
            public boolean test(Order order) {
                return order.getName().equalsIgnoreCase(Substring)  ;
            }
        };
    }

    public static Predicate<Order>RangeByPrice(float min, float max){
        return new Predicate<Order>() {
            @Override
            public boolean test(Order order) {
                return order.getPrice()>min && order.getPrice()<max;
            }
        };
    }


    public static Predicate<Order>RangeByTime(LocalDateTime minDate, LocalDateTime maxDate){
        return new Predicate<Order>() {
            @Override
            public boolean test(Order order) {
                return order.getPayedTime().compareTo(minDate)>0&&order.getPayedTime().compareTo(maxDate)<0;
            }
        };
    }



}
