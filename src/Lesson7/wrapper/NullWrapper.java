package Lesson7.wrapper;

public class NullWrapper {

    public static void main(String[] args) {
        Integer x = null;
        x++;
//        x = Integer.valueOf(x.intValue() + 1);
        System.out.println(x);
    }
}
