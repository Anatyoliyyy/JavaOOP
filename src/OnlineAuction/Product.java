package OnlineAuction;

import OnlineAuction.Enums.Category;

import java.io.Serializable;
import java.util.UUID;

public class Product implements Serializable {
    private final String id = UUID.randomUUID().toString();
    private final String name;
    private final String description;
    private final int quantity;
    private final Category category;

    public Product(String name, String description, int quantity, Category category) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.category = category;
    }

    public Product(String iphone, String something, int quantity, Category smartphone, String name, String description, int quantity1, Category category) {
        this.name = name;
        this.description = description;
        this.quantity = quantity1;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", category=" + category +
                '}';
    }
}
