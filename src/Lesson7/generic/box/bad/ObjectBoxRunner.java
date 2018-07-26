package Lesson7.generic.box.bad;

import Lesson7.generic.box.Cat;
import Lesson7.generic.box.Dog;

public class ObjectBoxRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        ObjectBox catBox = new ObjectBox(dog);

        sendBox(catBox);
    }

    private static void sendBox(ObjectBox catBox) {
        Object value = catBox.get();
        if (value instanceof Cat) {
            Cat cat = (Cat) value;
            cat.meow();
        } else {
            System.out.println("Where is my cat???");
        }
    }
}