package ch.noseryoung.demo.domain.product.dto;

public class ProductDTO {

    private Integer id;

    private String name;

    private Double price;

    public Integer getId() {
        return id;
    }

    public ProductDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductDTO setName(String name) {
        this.name = name;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public ProductDTO setPrice(Double price) {
        this.price = price;
        return this;
    }
}
