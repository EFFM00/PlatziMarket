package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.CategoryDto;
import com.platzi.market.persistence.entity.Categoria;
import jdk.jfr.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active")
    })
    CategoryDto toCategoryDto(Categoria categoria);
    List<CategoryDto> toListCategory(List<Categoria> categorias);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(CategoryDto category);
}
