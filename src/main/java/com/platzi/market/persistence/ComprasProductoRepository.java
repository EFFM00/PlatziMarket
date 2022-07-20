package com.platzi.market.persistence;


import com.platzi.market.domain.BuyesProductDto;
import com.platzi.market.domain.repository.BuyesProductDtoRepository;
import com.platzi.market.persistence.crud.ComprasProductoCrudRepository;
import com.platzi.market.persistence.entity.ComprasProducto;
import com.platzi.market.persistence.entity.ComprasProductoPK;
import com.platzi.market.persistence.mapper.BuyesProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ComprasProductoRepository implements BuyesProductDtoRepository {
    @Autowired
    private BuyesProductMapper mapper;
    @Autowired
    private ComprasProductoCrudRepository comprasProductoCrudRepository;

    @Override
    public List<BuyesProductDto> findAll() {
        List<ComprasProducto> comprasProductos = (List<ComprasProducto>) comprasProductoCrudRepository.findAll();
        return mapper.toBuyesList(comprasProductos);
    }

    @Override
    public void delete(ComprasProductoPK id) {
        comprasProductoCrudRepository.deleteById(id);
    }

    @Override
    public BuyesProductDto save(BuyesProductDto buyesProductDto) {
        return mapper.toBuyesProductDto(comprasProductoCrudRepository.save(mapper.toComprasProucto(buyesProductDto)));
    }

    @Override
    public List<BuyesProductDto> findByStock(Integer stock) {
        List<ComprasProducto> comprasProductos = comprasProductoCrudRepository.findByCantidad(stock);

        return mapper.toBuyesList(comprasProductos);
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

}
