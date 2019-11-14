package ch.noseryoung.demo.domain.auction.dto;

import java.sql.Date;

public class AuctionDTO {

    private Integer id;

    private Date startDate;

    private Date endDate;

    private Double instantPrice;

    private Double auctionPrice;

    public Integer getId() {
        return id;
    }

    public AuctionDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public AuctionDTO setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    public AuctionDTO setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public Double getInstantPrice() {
        return instantPrice;
    }

    public AuctionDTO setInstantPrice(Double instantPrice) {
        this.instantPrice = instantPrice;
        return this;
    }

    public Double getAuctionPrice() {
        return auctionPrice;
    }

    public AuctionDTO setAuctionPrice(Double auctionPrice) {
        this.auctionPrice = auctionPrice;
        return this;
    }
}
