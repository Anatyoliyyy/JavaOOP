package Lesson6.enum_example.gender.bad;

import static Lesson6.enum_example.gender.bad.BadUser.MALE;

public class BadUserRunner {

    public static void main(String[] args) {
        BadUser user = new BadUser("John", 20, MALE);
        String genderName = user.getGenderName();
        System.out.println(genderName);
    }
}
