package Lesson9.HomeWorke.Task1Storage;

import java.util.Optional;

public interface ProductStorage {
    Optional<Product> findById(long id);
    void save(Product product);
    void deleteById(long id);
}
