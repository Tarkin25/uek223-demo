package ch.noseryoung.demo.domain.product;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String name;

    @Column
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
