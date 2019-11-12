package ch.noseryoung.demo.domain.product;

import java.util.List;
import java.util.NoSuchElementException;

public interface ProductService {

    Double totalPrice(Integer startIndex, Integer endIndex);

    Product save(Product product);

    List<Product> findAll();

    Product findById(Integer id) throws NoSuchElementException;

    Product updateById(Integer id, Product product) throws NoSuchElementException;

    void deleteById(Integer id) throws NoSuchElementException;

}
