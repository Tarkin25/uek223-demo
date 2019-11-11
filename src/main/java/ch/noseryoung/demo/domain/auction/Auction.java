package ch.noseryoung.demo.domain.auction;

import ch.noseryoung.demo.domain.product.Product;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "auction")
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "instant_price")
    private Double instantPrice;

    @Column(name = "auction_price")
    private Double auctionPrice;

    @ManyToMany
    @JoinTable(
            name = "auction_product",
            joinColumns = @JoinColumn(name = "auction_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;

    public Integer getId() {
        return id;
    }

    public Auction setId(Integer id) {
        this.id = id;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Auction setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Auction setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public Double getInstantPrice() {
        return instantPrice;
    }

    public Auction setInstantPrice(Double instantPrice) {
        this.instantPrice = instantPrice;
        return this;
    }

    public Double getAuctionPrice() {
        return auctionPrice;
    }

    public Auction setAuctionPrice(Double auctionPrice) {
        this.auctionPrice = auctionPrice;
        return this;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Auction setProducts(List<Product> products) {
        this.products = products;
        return this;
    }
}
