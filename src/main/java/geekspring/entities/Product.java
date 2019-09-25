package geekspring.entities;

import java.util.UUID;

public class Product {
    private final String uuid;
    private Long id;
    private String title;
    private double cost;

    public Product() {
        uuid = UUID.randomUUID().toString();
    }

    public String getUUID() {
        return uuid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
