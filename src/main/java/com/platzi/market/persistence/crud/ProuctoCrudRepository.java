package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProuctoCrudRepository extends CrudRepository<Producto, Long> {

}
