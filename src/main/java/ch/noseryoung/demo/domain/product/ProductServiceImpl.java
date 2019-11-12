package ch.noseryoung.demo.domain.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;

    @Autowired
    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Double totalPrice(Integer startIndex, Integer endIndex) {
        Double total = 0.0;

        for(Product product : findAll().subList(startIndex, endIndex)) {
            total += product.getPrice();
        }

        return total;
    }

    @Override
    public Product save(Product product) {
        product.setId(null);

        return repository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product findById(Integer id) throws NoSuchElementException {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Product updateById(Integer id, Product product) throws NoSuchElementException {
        if(!repository.existsById(id)) throw new NoSuchElementException();

        product.setId(id);

        return repository.save(product);
    }

    @Override
    public void deleteById(Integer id) throws NoSuchElementException {
        if(!repository.existsById(id)) throw new NoSuchElementException();

        repository.deleteById(id);
    }
}
