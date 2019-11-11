package ch.noseryoung.demo.domain.auction;

import ch.noseryoung.demo.domain.product.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    @GetMapping
    public ResponseEntity<List<Auction>> findAll() {
        return new ResponseEntity<>(Auction.getAuctions(), HttpStatus.OK);
    }

    @GetMapping("/{index}")
    public ResponseEntity<Auction> findByIndex(@PathVariable Integer index) {
        return new ResponseEntity<>(Auction.getAuctions().get(index), HttpStatus.OK);
    }

    @GetMapping("/{index}/products")
    public ResponseEntity<List<Product>> findProductsByIndex(@PathVariable Integer index) {
        return new ResponseEntity<>(Auction.getAuctions().get(index).getProducts(), HttpStatus.OK);
    }

}
