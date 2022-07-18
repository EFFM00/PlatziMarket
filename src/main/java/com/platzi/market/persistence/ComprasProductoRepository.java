package com.platzi.market.persistence;


import com.platzi.market.persistence.crud.ComprasProductoCrudRepository;
import com.platzi.market.persistence.entity.ComprasProducto;
import com.platzi.market.persistence.entity.ComprasProductoPK;

import java.util.List;
import java.util.Optional;

public class ComprasProductoRepository {

    private ComprasProductoCrudRepository comprasProductoCrudRepository;

    public List<ComprasProducto> findAll() {
        return (List<ComprasProducto>) comprasProductoCrudRepository.findAll();
    }

    public void deleteById(ComprasProductoPK id){
        comprasProductoCrudRepository.deleteById(id);
    }

    public ComprasProducto save(ComprasProducto comprasProducto){
        return comprasProductoCrudRepository.save(comprasProducto);
    }

    public Optional<ComprasProducto> findById(ComprasProductoPK id){
        return comprasProductoCrudRepository.findById(id);
    }

    public Optional<List<ComprasProducto>> findByTotal(Double total){
        return comprasProductoCrudRepository.findByTotal(total);
    }

    public Optional<List<ComprasProducto>> findByEstado(Boolean estado){
        return comprasProductoCrudRepository.findByEstado(estado);
    }

    public Optional<List<ComprasProducto>> findByCantidad(Integer cantidad){
        return comprasProductoCrudRepository.findByCantidad(cantidad);
    }
}
