package com.platzi.market.persistence;

import com.platzi.market.domain.CategoryDto;
import com.platzi.market.domain.repository.CategoryDtoRepository;
import com.platzi.market.persistence.crud.CategoriaCrudRepository;
import com.platzi.market.persistence.entity.Categoria;
import com.platzi.market.persistence.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoriaRepository implements CategoryDtoRepository {

    @Autowired
    private CategoryMapper mapper;
    @Autowired
    private CategoriaCrudRepository categoriaCrudRepository;

    @Override
    public List<CategoryDto> findAll(){
        List<Categoria> categorias = (List<Categoria>) categoriaCrudRepository.findAll();
        return mapper.toListCategory(categorias);
    }

    public void deleteById(Long id){
        categoriaCrudRepository.deleteById(id);
    }

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public List<CategoryDto> findByState(Boolean estado) {
        List<Categoria> categorias = categoriaCrudRepository.findByEstado(estado);
        return mapper.toListCategory(categorias);
    }

    @Override
    public List<CategoryDto> findByCategory(String category) {
        return null;
    }

    @Override
    public Optional<CategoryDto> findById(Long id){
        return categoriaCrudRepository.findById(id).map(categoria -> mapper.toCategoryDto(categoria));
    }

    public Optional<List<Categoria>> findByEstadoAndIdCategoria(Boolean estado, Long idCategoria){
        return categoriaCrudRepository.findByEstadoAndIdCategoria(estado, idCategoria);
    }

    public List<Categoria> findByDescripcion(String descripcion){
        return categoriaCrudRepository.findByDescripcion(descripcion);
    }
}
