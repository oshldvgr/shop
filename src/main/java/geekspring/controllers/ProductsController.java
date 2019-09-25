package geekspring.controllers;

import geekspring.entities.Product;
import geekspring.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @RequestMapping("/")
    public String findProduct() {
        return "find_product";
    }

    // http://localhost:8189/shop/products/addProduct
    @RequestMapping("/addProduct")
    public String showProductForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "product_form";
    }

    @RequestMapping(value = "/processForm", method = POST)
    public String processForm(Model model, Product product) {
        System.out.println(product.getTitle() + ": cost " + product.getCost() + " , UUID " + product.getUUID());
        productsService.addProduct(product);
        model.addAttribute("pageTitle", "Current product was successfully added");
        model.addAttribute("product", productsService.getProductById(product.getId()));
        return "show_product";
    }

    // http://localhost:8189/shop/products/getProduct
    @RequestMapping("/getProduct")
    public String showProduct(Model model, @RequestParam Long id) {
        Product product = productsService.getProductById(id);
        if (product != null) {
            model.addAttribute("pageTitle", "Found product:");
            model.addAttribute("product", product);
        } else {
            model.addAttribute("pageTitle", "Product was not found");
        }

        return "show_product";
    }

    // http://localhost:8189/shop/products/getProduct
    @RequestMapping("/showAllProducts")
    public String showAllProducts(Model model) {
        Set<Product> productList = productsService.geAllProducts();
        model.addAttribute("productList", productList);
        return "show_all";
    }
}
