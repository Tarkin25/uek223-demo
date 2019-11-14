package ch.noseryoung.demo.domain.auction;

import ch.noseryoung.demo.domain.auction.dto.AuctionDTO;
import ch.noseryoung.demo.domain.auction.dto.AuctionMapper;
import ch.noseryoung.demo.domain.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionService auctionService;
    private AuctionMapper auctionMapper;

    @Autowired
    public AuctionController(AuctionService auctionService, AuctionMapper auctionMapper) {
        this.auctionService = auctionService;
        this.auctionMapper = auctionMapper;
    }

    @GetMapping
    public ResponseEntity<List<AuctionDTO>> findAll() {
        List<Auction> auctions = auctionService.findAll();

        return new ResponseEntity<>(auctionMapper.toDTOs(auctions), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuctionDTO> findById(@PathVariable Integer id) {
        Auction auction = auctionService.findById(id);

        return new ResponseEntity<>(auctionMapper.toDTO(auction), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<AuctionDTO> save(@RequestBody AuctionDTO auctionDTO) {
        Auction auction = auctionService.save(auctionMapper.fromDTO(auctionDTO));

        return new ResponseEntity<>(auctionMapper.toDTO(auction), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AuctionDTO> updateById(@PathVariable Integer id, @RequestBody AuctionDTO auctionDTO) {
        Auction auction = auctionService.updateById(id, auctionMapper.fromDTO(auctionDTO));

        return new ResponseEntity<>(auctionMapper.toDTO(auction), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        auctionService.deleteById(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
