package com.oscar.demoMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
import java.util.Optional;
 
import static java.util.stream.Collectors.toList;
 
@Service
final class ProductServiceImpl implements ProductService {
 
    private final ProductRepository repository;
 
    @Autowired
    ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }
 
    @Override
    public List<ProductDTO> findAll() {
        List<Product> todoEntries = repository.findAll();
		System.out.println(todoEntries);
        return convertToDTOs(todoEntries);
    }
 
    private List<ProductDTO> convertToDTOs(List<Product> models) {
        return models.stream()
                .map(this::convertToDTO)
                .collect(toList());
    }
 
    private ProductDTO convertToDTO(Product model) {
        ProductDTO dto = new ProductDTO();
 
        //dto.setId(model.getId());
        dto.setName(model.getName());
        dto.setPrice(model.getPrice());
 
        return dto;
    }
}