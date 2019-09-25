package geekspring.services;

import geekspring.entities.Product;
import geekspring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ProductsService {
    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    public Product getProductById(Long id) {
        return productRepository.getById(id);
    }

    public Set<Product> geAllProducts() {
        return productRepository.findAll();
    }
}
