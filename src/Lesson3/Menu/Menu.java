package Lesson3.Menu;

import java.util.ArrayList;

public class Menu {

    private final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public Dish getCheapestDish() {
        if (dishes.isEmpty()) {
            throw new IllegalStateException("can't find cheapest dish in an empty menu");
        }

        Dish cheapestDish = dishes.get(0);
        for (Dish dish : dishes) {
            if (dish.getPrice() < cheapestDish.getPrice()) {
                cheapestDish = dish;
            }
        }
        return cheapestDish;
    }

    public String getName() {
        return name;
    }

//    public ArrayList<Dish> getDishes() {
//        return new ArrayList<>(dishes);
//    }

    public String show() {
        return ""; // TODO
    }

    public String toString() {
        return "Menu{" +
                "dishes=" + dishes +
                '}';
    }
}
