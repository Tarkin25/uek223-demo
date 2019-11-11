package ch.noseryoung.demo.domain.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<String> product() {
        String message = "Hello, I am a product";

        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> productWithId(@PathVariable("id") Long id) {
        String message = "Hello, I am a product with ID " + id;

        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
