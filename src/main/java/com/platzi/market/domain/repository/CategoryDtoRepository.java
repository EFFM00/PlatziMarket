package com.platzi.market.domain.repository;

import com.platzi.market.domain.CategoryDto;

import java.util.List;
import java.util.Optional;

public interface CategoryDtoRepository {

    Optional<CategoryDto> findById(Long id);
    List<CategoryDto> findAll();

    void deleteById(Long id);

    CategoryDto save(CategoryDto categoryDto);

    List<CategoryDto> findByState(Boolean estado);

    List<CategoryDto> findByCategory(String category);
}
