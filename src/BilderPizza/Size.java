package BilderPizza;

public enum Size {
    LITTLE("Lille "),
    MIDDLE("Middle "),
    BIG("Big ");

    private final String description;

    Size(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Size{" +
                "description='" + description + '\'' +
                '}';
    }
}
