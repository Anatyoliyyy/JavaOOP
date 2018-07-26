package KP2;

import java.util.UUID;

public class Lot {

    private final String id = UUID.randomUUID().toString();
    private final String name;
    private final ProductCategory category;
    private final long startingPrice;
    private final String description;
    private final User user;

    public Lot(User user, String name, ProductCategory category, long startingPrice /*long currentPrice*/, String description) {

        this.name = name;
        this.category = category;
        this.startingPrice = startingPrice;
        this.description = description;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public long getStartingPrice() {
        return startingPrice;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Lot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", startingPrice=" + startingPrice +
                /*", currentPrice=" + currentPrice +*/
                ", description='" + description + '\'' +
                '}';
    }


}
