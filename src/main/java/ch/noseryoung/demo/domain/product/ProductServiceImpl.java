package ch.noseryoung.demo.domain.product;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public Double totalPrice(Integer startIndex, Integer endIndex) {
        Double total = 0.0;

        for(Product product : Product.getProducts().subList(startIndex, endIndex)) {
            total += product.getPrice();
        }

        return total;
    }
}
