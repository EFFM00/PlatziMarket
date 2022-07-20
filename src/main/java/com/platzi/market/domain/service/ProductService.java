package com.platzi.market.domain.service;

import com.platzi.market.domain.ProductDto;
import com.platzi.market.domain.repository.ProductDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductDtoRepository productDtoRepository;

    public Optional<ProductDto> getById(Long id){
        return productDtoRepository.getById(id);
    };

    public List<ProductDto> getAll(){
        return productDtoRepository.getAll();
    };

    public Boolean delete(Long id){
        return getById(id).map(producto -> {
            productDtoRepository.delete(id);
            return true;
        }).orElse(false);

    };

    public ProductDto save(ProductDto product){
        return productDtoRepository.save(product);
    };
}
