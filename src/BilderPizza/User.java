package BilderPizza;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private final String id = UUID.randomUUID().toString();
    private final String name;
    private final String lastName;
    private final Account account;
    private final List<Order> orders  = new ArrayList<>();
    private List<Order> completedOrders = new ArrayList<>();
    private final LocalDateTime TimeRegistration = LocalDateTime.now();
    private  float ordersprice=0;

    public User(String name, String lastName, Account account) {
        this.name = name;
        this.lastName = lastName;
        this.account = account;
    }



    public float getPriceOrders(List<Order> orders){
        for(Order order:orders){
            ordersprice=ordersprice+order.getPrice();
        }
        return ordersprice;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public LocalDateTime getTimeRegistration() {
        return TimeRegistration;
    }

    public boolean payForCurrentOrder(){
        float price = getPriceOrders(orders);
        boolean  success = account.withdraw(price);

        if(!success){
            return false;
        }
        completedOrders=orders;
        return true;
    }

    public List<Order> getCompletedOrders() {
        return completedOrders;
    }

    public float getRemainingMoney() {
        return account.getMoney();
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                ", orders=" + orders +
                ", TimeRegistration=" + TimeRegistration +
                '}';
    }
}

