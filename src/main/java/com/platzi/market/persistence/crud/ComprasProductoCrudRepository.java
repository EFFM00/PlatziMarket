package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.ComprasProducto;
import com.platzi.market.persistence.entity.ComprasProductoPK;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ComprasProductoCrudRepository extends CrudRepository<ComprasProducto, ComprasProductoPK> {

    Optional<List<ComprasProducto>> findByTotal(Double total);

    Optional<List<ComprasProducto>> findByEstado(Boolean estado);

    Optional<List<ComprasProducto>> findByCantidad(Integer cantidad);
}
