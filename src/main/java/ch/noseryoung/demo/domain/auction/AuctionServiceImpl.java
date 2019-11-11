package ch.noseryoung.demo.domain.auction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AuctionServiceImpl implements AuctionService {

    private AuctionRepository repository;

    @Autowired
    public AuctionServiceImpl(AuctionRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Auction> findAll() {
        return repository.findAll();
    }

    @Override
    public Auction findById(Integer id) throws NoSuchElementException {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Auction save(Auction auction) {
        auction.setId(null);

        return repository.save(auction);
    }

    @Override
    public Auction updateById(Integer id, Auction auction) throws NoSuchElementException {
        if(!repository.existsById(id)) throw new NoSuchElementException();

        auction.setId(id);

        return repository.save(auction);
    }

    @Override
    public void deleteById(Integer id) throws NoSuchElementException {
        if(!repository.existsById(id)) throw new NoSuchElementException();

        repository.deleteById(id);
    }
}
