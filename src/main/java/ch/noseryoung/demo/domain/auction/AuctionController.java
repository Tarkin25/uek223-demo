package ch.noseryoung.demo.domain.auction;

import ch.noseryoung.demo.domain.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
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

    private AuctionService auctionService;

    @Autowired
    public AuctionController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }

    @GetMapping
    public ResponseEntity<List<Auction>> findAll() {
        return new ResponseEntity<>(auctionService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Auction> findById(@PathVariable Integer id) {
        return new ResponseEntity<>(auctionService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/{id}/products")
    public ResponseEntity<List<Product>> findProductsById(@PathVariable Integer id) {
        return new ResponseEntity<>(auctionService.findById(id).getProducts(), HttpStatus.OK);
    }

}
