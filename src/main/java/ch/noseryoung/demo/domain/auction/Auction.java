package ch.noseryoung.demo.domain.auction;

import ch.noseryoung.demo.domain.product.Product;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

public class Auction {

    private static final List<Auction> AUCTIONS = Arrays.asList(
            new Auction()
                    .setId(1)
                    .setStartDate(Date.valueOf("2019-11-13"))
                    .setEndDate(Date.valueOf("2019-11-15"))
                    .setInstantPrice(2000.0)
                    .setAuctionPrice(1500.0)
                    .setProducts(Product.getProducts().subList(0, 1)),
            new Auction()
                    .setId(2)
                    .setStartDate(Date.valueOf("2019-11-13"))
                    .setEndDate(Date.valueOf("2019-11-15"))
                    .setInstantPrice(2000.0)
                    .setAuctionPrice(1500.0)
                    .setProducts(Product.getProducts().subList(5, 6)),
            new Auction()
                    .setId(3)
                    .setStartDate(Date.valueOf("2019-11-13"))
                    .setEndDate(Date.valueOf("2019-11-15"))
                    .setInstantPrice(2000.0)
                    .setAuctionPrice(1500.0)
                    .setProducts(Product.getProducts().subList(3, 5))
    );

    public static List<Auction> getAuctions() {
        return AUCTIONS;
    }

    private Integer id;

    private Date startDate;

    private Date endDate;

    private Double instantPrice;

    private Double auctionPrice;

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
