package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.CategoriaCrudRepository;
import com.platzi.market.persistence.entity.Categoria;

import java.util.List;
import java.util.Optional;

public class CategoriaRepository {

    private CategoriaCrudRepository categoriaCrudRepository;

    public List<Categoria> findAll(){
        return (List<Categoria>) categoriaCrudRepository.findAll();
    }

    public void deleteById(Long id){
        categoriaCrudRepository.deleteById(id);
    }

    public Categoria save(Categoria categoria){
        return categoriaCrudRepository.save(categoria);
    }

    public Optional<Categoria> findById(Long id){
        return categoriaCrudRepository.findById(id);
    }

    public Optional<List<Categoria>> findByEstado(Boolean estado){
        return categoriaCrudRepository.findByEstado(estado);
    }

    public Optional<List<Categoria>> findByEstadoAndIdCategoria(Boolean estado, Long idCategoria){
        return categoriaCrudRepository.findByEstadoAndIdCategoria(estado, idCategoria);
    }
}
