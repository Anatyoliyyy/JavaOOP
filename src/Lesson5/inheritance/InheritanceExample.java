package Lesson5.inheritance;

public class InheritanceExample {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Vasya", 25);

        p1.sayHello();
        p2.sayHello();
        System.out.println();

        Developer dev1 = new Developer("Petya", 30, "Google");
        dev1.sayHello();
        dev1.writeCode();
        System.out.println();

        Person p3 = new Developer("Masha", 25, "Amazon");
        p3.sayHello();
    }
}

class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("UNNAMED", 0);
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }

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
        super.sayHello(); // bad practice
    }
}
