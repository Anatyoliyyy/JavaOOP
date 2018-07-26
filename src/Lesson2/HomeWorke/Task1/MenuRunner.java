package Lesson2.HomeWorke.Task1;

/*
Написать класс:
Клиентский класс MenuRunner: создать 2 меню, каждое заполнить 3-я блюдами,
протестировать функционал нахождения самого дешевого блюда.
 */


import Lesson2.HomeWorke.Task1.Dish;
import Lesson2.HomeWorke.Task1.Menu;

public class MenuRunner {

    public static void main(String[] args) {
        Menu menu1 = new Menu("Menu 1");
        menu1.addDish(new Dish("Borch", "Red soup with beetroot", 30));
        menu1.addDish(new Dish("French fries", "Potato fried in oil", 25));
        menu1.addDish(new Dish("Schnitzel", "Peace of beef cooked on grill", 40));

        Menu menu2 = new Menu("Menu 2");
        menu2.addDish(new Dish("Tea", "Boiled water with tea leaves", 8));
        menu2.addDish(new Dish("Milkshake", "Whipped milk with ice cream and topping", 25));
        menu2.addDish(new Dish("Coca-cola", "Black sweet soda water", 15));

        System.out.println(menu1);
        System.out.println("The cheapest dish from menu 1: " + menu1.getCheapestDish());

        System.out.println(menu2);
        System.out.println("The cheapest dish from menu 2: " +menu2.getCheapestDish());

    }
}


//Menu name: Menu 1
//Dishes:
//Borch - 30 UAH
//French fries - 25 UAH
//Schnitzel - 40 UAH
//
//The cheapest dish from menu 1: French fries - 25 UAH
//
//Menu name: Menu 2
//Dishes:
//Tea - 8 UAH
//Milkshake - 25 UAH
//Coca-cola - 15 UAH
//
//The cheapest dish from menu 2: Tea - 8 UAH
//
//
//Process finished with exit code 0