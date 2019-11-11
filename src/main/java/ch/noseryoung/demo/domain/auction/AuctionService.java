package ch.noseryoung.demo.domain.auction;

import java.util.List;
import java.util.NoSuchElementException;

public interface AuctionService {

    List<Auction> findAll();

    Auction findById(Integer id) throws NoSuchElementException;

    Auction save(Auction auction);

    Auction updateById(Integer id, Auction auction) throws NoSuchElementException;

    void deleteById(Integer id) throws NoSuchElementException;

}
