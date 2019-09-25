package geekspring.repositories;

import geekspring.entities.Product;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Component
public class ProductRepository {
    private Map<Long, Product> repository = new HashMap<>();

    public void addProduct(Product product) {
        repository.putIfAbsent(product.getId(), product);
    }

    public Product getById(Long id) {
        return repository.get(id);
    }

    public Set<Product> findAll() {
        return new HashSet<Product>(repository.values());
    }


}
