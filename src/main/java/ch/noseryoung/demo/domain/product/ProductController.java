package ch.noseryoung.demo.domain.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private static final List<Product> PRODUCTS = Arrays.asList(
            new Product().setId(1).setName("Lenovo ThinkPad").setPrice(1500.0),
            new Product().setId(2).setName("MacBook Pro").setPrice(2000.0),
            new Product().setId(3).setName("Dell X360").setPrice(1200.0)
    );

    @GetMapping
    public ResponseEntity<List<Product>> product() {
        return new ResponseEntity<>(PRODUCTS, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> productWithId(@PathVariable("id") Integer id) {
        Product product = PRODUCTS.get(id-1);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

}
