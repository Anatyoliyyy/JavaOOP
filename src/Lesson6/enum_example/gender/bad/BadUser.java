package Lesson6.enum_example.gender.bad;

public class BadUser {

    public static final int MALE = 0;
    public static final int FEMALE = 1;
    public static final int UNDEFINED = 2;

    private final String name;
    private final int age;
    private final int gender;

    public BadUser(String name, int age, int gender) {
        checkGender(gender);
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private void checkGender(int gender) {
        if (gender < 0 || gender > 2) {
            throw new IllegalArgumentException("illegal gender: " + gender);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public String getGenderName() {
        switch (gender) {
            case MALE: return "male";
            case FEMALE: return "female";
            default:
            case UNDEFINED: return "undefined";
        }
    }

    @Override
    public String toString() {
        return "BadUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + getGenderName() +
                '}';
    }
}
