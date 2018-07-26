package BilderPizza;

public class PizzaAppRunner {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Maragarita",Size.LITTLE,5);
        Pizza pizza2 = new Pizza("Double Cheese", Size.MIDDLE, 9);
        Pizza pizza3 = new Pizza("Peperoni", Size.BIG, 13);
        Drink drink1 = new Drink("Coca-cola", Size.LITTLE, 3);
        Drink drink2 = new Drink("Pepsi", Size.MIDDLE, 5);
        Drink drink3 = new Drink("tea", Size.BIG,7);

        Order order1 = new Order("Order number 1", 4);
        Order order2 = new Order("Order number 2", 9);
        Order order3 = new Order ("Order number 3", 16);
        Order order4 = new Order ("Order number 4", 20);

        order1.addItem(pizza1);
        order1.addItem(drink1);
        order2.addItem(pizza2);
        order2.addItem(drink2);
        order3.addItem(pizza3);
        order3.addItem(drink3);
        order4.addItem(pizza3);
        order4.addItem(pizza3);
        order4.addItem(drink3);
        order4.addItem(drink3);

        Orders orders = new Orders("Orders for my family");
        orders.addOrders(order1);
        orders.addOrders(order2);
        orders.addOrders(order3);
        orders.addOrders(order4);

        // check comparator
        orders.sort(OrderComparator.byPrice());
        System.out.println(orders);
        System.out.println();
        System.out.println();

        // check filter
        orders.filter(filter.RangeByPrice(4,4));
        System.out.println(orders);
        System.out.println(order1.getPrice());
        System.out.println(order2.getPrice());
        System.out.println(order3.getPrice());
        System.out.println(order4.getPrice());
        System.out.println();
        System.out.println();
        System.out.println(orders.filter(filter.RangeByPrice(9,21)));

        // check IO file.txt

        orders.getOrdersToTxt();
        orders.loadOrdersFromFile("Orders.txt", orders);
        System.out.println(orders.getNames(""));


        // check binari IO
        orders.clone();
        System.out.println(orders);




    }
}


//Orders{orders=[Order{name='Order number 1', order=[Pizza{name='Maragarita', size=Size{description='Lille '}, price=5.0}, Drink{name='Coca-cola', size=Size{description='Lille '}, price=3.0}], PayedTime=null}
//, Order{name='Order number 2', order=[Pizza{name='Double Cheese', size=Size{description='Middle '}, price=9.0}, Drink{name='Pepsi', size=Size{description='Middle '}, price=5.0}], PayedTime=null}
//, Order{name='Order number 3', order=[Pizza{name='Peperoni', size=Size{description='Big '}, price=13.0}, Drink{name='tea', size=Size{description='Big '}, price=7.0}], PayedTime=null}
//, Order{name='Order number 4', order=[Pizza{name='Peperoni', size=Size{description='Big '}, price=13.0}, Pizza{name='Peperoni', size=Size{description='Big '}, price=13.0}, Drink{name='tea', size=Size{description='Big '}, price=7.0}, Drink{name='tea', size=Size{description='Big '}, price=7.0}], PayedTime=null}
//]}
//
//
//Orders{orders=[Order{name='Order number 1', order=[Pizza{name='Maragarita', size=Size{description='Lille '}, price=5.0}, Drink{name='Coca-cola', size=Size{description='Lille '}, price=3.0}], PayedTime=null}
//, Order{name='Order number 2', order=[Pizza{name='Double Cheese', size=Size{description='Middle '}, price=9.0}, Drink{name='Pepsi', size=Size{description='Middle '}, price=5.0}], PayedTime=null}
//, Order{name='Order number 3', order=[Pizza{name='Peperoni', size=Size{description='Big '}, price=13.0}, Drink{name='tea', size=Size{description='Big '}, price=7.0}], PayedTime=null}
//, Order{name='Order number 4', order=[Pizza{name='Peperoni', size=Size{description='Big '}, price=13.0}, Pizza{name='Peperoni', size=Size{description='Big '}, price=13.0}, Drink{name='tea', size=Size{description='Big '}, price=7.0}, Drink{name='tea', size=Size{description='Big '}, price=7.0}], PayedTime=null}
//]}
//8.0
//14.0
//20.0
//40.0
//
//
//[Order{name='Order number 2', order=[Pizza{name='Double Cheese', size=Size{description='Middle '}, price=9.0}, Drink{name='Pepsi', size=Size{description='Middle '}, price=5.0}], PayedTime=null}
//, Order{name='Order number 3', order=[Pizza{name='Peperoni', size=Size{description='Big '}, price=13.0}, Drink{name='tea', size=Size{description='Big '}, price=7.0}], PayedTime=null}
//]
//Orders for my family
//error: java.io.NotSerializableException: BilderPizza.Pizza
//Error: java.io.WriteAbortedException: writing aborted; java.io.NotSerializableException: BilderPizza.Pizza
//Orders{orders=[Order{name='Order number 1', order=[Pizza{name='Maragarita', size=Size{description='Lille '}, price=5.0}, Drink{name='Coca-cola', size=Size{description='Lille '}, price=3.0}], PayedTime=null}
//, Order{name='Order number 2', order=[Pizza{name='Double Cheese', size=Size{description='Middle '}, price=9.0}, Drink{name='Pepsi', size=Size{description='Middle '}, price=5.0}], PayedTime=null}
//, Order{name='Order number 3', order=[Pizza{name='Peperoni', size=Size{description='Big '}, price=13.0}, Drink{name='tea', size=Size{description='Big '}, price=7.0}], PayedTime=null}
//, Order{name='Order number 4', order=[Pizza{name='Peperoni', size=Size{description='Big '}, price=13.0}, Pizza{name='Peperoni', size=Size{description='Big '}, price=13.0}, Drink{name='tea', size=Size{description='Big '}, price=7.0}, Drink{name='tea', size=Size{description='Big '}, price=7.0}], PayedTime=null}
//]}
//
//Process finished with exit code 0