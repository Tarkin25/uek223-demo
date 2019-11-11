package ch.noseryoung.demo.domain.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> product() {
        return new ResponseEntity<>(Product.getProducts(), HttpStatus.OK);
    }

    @GetMapping("/{index}")
    public ResponseEntity<Product> productWithId(@PathVariable("index") Integer index) {
        Product product = Product.getProducts().get(index);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/total")
    public ResponseEntity<Double> totalPrice(@RequestParam Integer startIndex, @RequestParam Integer endIndex) {
        Double totalPrice = productService.totalPrice(startIndex, endIndex);

        return new ResponseEntity<>(totalPrice, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }

}
