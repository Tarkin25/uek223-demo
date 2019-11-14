package ch.noseryoung.demo.domain.product.dto;

import ch.noseryoung.demo.domain.product.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {

    ProductDTO toDTO(Product product);

    List<ProductDTO> toDTOs(List<Product> products);

    Product fromDTO(ProductDTO productDTO);

    List<Product> fromDTOs(List<ProductDTO> productDTOS);

}
