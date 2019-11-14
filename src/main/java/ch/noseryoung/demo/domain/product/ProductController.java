package ch.noseryoung.demo.domain.product;

import ch.noseryoung.demo.domain.product.dto.ProductDTO;
import ch.noseryoung.demo.domain.product.dto.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;
    private ProductMapper productMapper;

    @Autowired
    public ProductController(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll() {
        List<Product> products = productService.findAll();

        return new ResponseEntity<>(productMapper.toDTOs(products), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable Integer id) {
        Product product = productService.findById(id);

        return new ResponseEntity<>(productMapper.toDTO(product), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductDTO> save(@RequestBody ProductDTO productDTO) {
        Product product = productService.save(productMapper.fromDTO(productDTO));

        return new ResponseEntity<>(productMapper.toDTO(product), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> updateById(@PathVariable Integer id, @RequestBody ProductDTO productDTO) {
        Product product = productService.updateById(id, productMapper.fromDTO(productDTO));

        return new ResponseEntity<>(productMapper.toDTO(product), HttpStatus.OK);
    }

    @GetMapping("/total")
    public ResponseEntity<Double> totalPrice(@RequestParam Integer startIndex, @RequestParam Integer endIndex) {
        Double totalPrice = productService.totalPrice(startIndex, endIndex);

        return new ResponseEntity<>(totalPrice, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        productService.deleteById(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
