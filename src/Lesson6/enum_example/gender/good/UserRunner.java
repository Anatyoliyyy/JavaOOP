package Lesson6.enum_example.gender.good;

public class UserRunner {

    public static void main(String[] args) {
        Gender gender = Gender.UNDEFINED;
        User user = new User("Taras", 25, gender);
//        user.getGenderName()

        System.out.println(gender.name()); // MALE
        System.out.println(gender.ordinal()); // 0
    }
}