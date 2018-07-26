package Lesson6.abstractclass;

public class AbstractClassExample {

    public static void main(String[] args) {
        Developer dev1 = new Developer("Petya", 30, "Google");
        dev1.sayHello();
        dev1.writeCode();
        System.out.println();

        Person p3 = new Developer("Masha", 25, "Amazon");
        p3.sayHello();
    }
}

abstract class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("UNNAMED", 0);
    }

    public abstract void sayHello();

    protected String getName() {
        return name;
    }
}

class Developer extends Person {

    private final String company;

    public Developer(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public void writeCode() {
        System.out.println("I write code in " + company);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm " + getName() + ", dev from " + company);
    }
}
