package ch.noseryoung.demo.domain.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<List<Product>> product() {
        return new ResponseEntity<>(Product.getProducts(), HttpStatus.OK);
    }

    @GetMapping("/{index}")
    public ResponseEntity<Product> productWithId(@PathVariable("index") Integer index) {
        Product product = Product.getProducts().get(index);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

}
