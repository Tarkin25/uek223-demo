package ch.noseryoung.demo.domain.product;

import java.util.Arrays;
import java.util.List;

public class Product {

    private static final List<Product> PRODUCTS = Arrays.asList(
            new Product().setId(1).setName("Lenovo ThinkPad").setPrice(1500.0),
            new Product().setId(2).setName("MacBook Pro").setPrice(2000.0),
            new Product().setId(3).setName("Dell X360").setPrice(1200.0),
            new Product().setId(4).setName("A pair of socks").setPrice(4.50),
            new Product().setId(5).setName("One Shoe").setPrice(50.0),
            new Product().setId(6).setName("Shoelaces").setPrice(20.0),
            new Product().setId(7).setName("**Gucci** Socks").setPrice(500.0)
    );

    public static List<Product> getProducts() {
        return PRODUCTS;
    }

    private Integer id;

    private String name;

    private Double price;

    public Integer getId() {
        return id;
    }

    public Product setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Product setPrice(Double price) {
        this.price = price;
        return this;
    }
}
