package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Long> {

    //Este es un método
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)

    Optional<List<Producto>> findByIdCategoriaOrderByNombreAsc(Long idCategoria);

    Optional<List<Producto>> findByIdCategoriaOrderByStockAsc(Long idCategoria);

    Optional<List<Producto>> findByNombreOrderByNombreAsc(String nombre);

    Optional<List<Producto>> findByNombreAndIdCategoriaOrderByNombreAsc(String nombre, Long idCategoria);

    Optional<List<Producto>> findByNombreAndPrecioVentaOrderByPrecioVentaDesc(String nombre, Double precioVenta);
}
