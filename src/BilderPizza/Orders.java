package BilderPizza;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Orders implements Serializable {
    private final String names;
    private final List<Order> orders = new ArrayList<>();

    public Orders(String names) {
        this.names=names;
    }

    public String getNames(String s) {
        return names;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrders(Order order){
        orders.add(order);
    }

    public float PriceAllOrders(List<Order> orders){
        float PriceAllOrders = 0;
        for (Order order:orders){
            PriceAllOrders=PriceAllOrders+order.getPrice()+order.PriceWithDelivery();
        }

        return PriceAllOrders;
    }

    public void sort(Comparator<Order> comparator){
        orders.sort(comparator);
    }

    public List<Order>filter (Predicate<Order> filter){
        List<Order>result = new ArrayList<>();
        for (Order order: orders){
            if (filter.test(order)){
                result.add(order);
            }
        } return result;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orders=" + orders +
                '}';
    }

    public void getOrdersToTxt(){


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Orders.txt "));

            for (Order order:orders) {
                writer.write(order.getName() + " "+  " price:  " + order.getPrice() + "\n");}
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  void loadOrdersFromFile (String file, Orders orders ){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            orders.getNames(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public Orders clone() throws ClonException{



        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("tempFile.bin"))){
            out.writeObject(this);
            System.out.println("serialization completed");
        } catch (ClonException e){
            System.out.println("failed: " + e);
        } catch (IOException e){
            System.out.println("error: " + e);
        }

        Orders deserializedOrders = this;

        try(ObjectInputStream inp = new ObjectInputStream(new FileInputStream("tempFile.bin"))){
            deserializedOrders = (Orders) inp.readObject();
            System.out.println("deserialization completed");
        } catch (ClonException e){
            System.out.println("failed: " + e);
        } catch (ClassNotFoundException e){
            System.out.println("failed : " + e);
        } catch (IOException e){
            System.out.println("Error: " + e);
        }

        return deserializedOrders;
    }


}
