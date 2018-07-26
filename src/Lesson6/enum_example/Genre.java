package Lesson6.enum_example;

public enum Genre {
    ACTION("ACTION DESCR"),
    DRAMA("DRAMA DESCR"),
    COMEDY("Funny movie");

    private final String description;

    Genre(String description) {
        this.description = description;
    }

    public String shortName() {
        return name().substring(0, 3);
    }

    public String getDescription() {
        return description;
    }
}
