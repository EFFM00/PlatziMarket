package com.platzi.market.domain.repository;

import com.platzi.market.domain.ProductDto;
import com.platzi.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductDtoRepository {

    Optional<ProductDto> getById(Long id);

    List<ProductDto> getAll();

    void delete(Long id);

    ProductDto save(ProductDto product);
}
