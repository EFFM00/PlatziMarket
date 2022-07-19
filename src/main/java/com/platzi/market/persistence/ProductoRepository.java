package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> findAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public void deleteById(Long id){
        productoCrudRepository.deleteById(id);
    }

    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    public Optional<Producto> findById(Long id){
        return productoCrudRepository.findById(id);
    }

    public Optional<List<Producto>> findByIdCategoria(Long id){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(id);
    }

    public Optional<List<Producto>> findByIdCategoriaWithStock(Long id){
        return productoCrudRepository.findByIdCategoriaOrderByStockAsc(id);
    }

    public Optional<List<Producto>> findByNombre(String nombre) {
        return productoCrudRepository.findByNombreOrderByNombreAsc(nombre);
    }

    public Optional<List<Producto>> findByNombreAndIdCategoriaOrderByNombreAsc(String nombre, Long idCategoria) {
        return productoCrudRepository.findByNombreAndIdCategoriaOrderByNombreAsc(nombre, idCategoria);
    }

    public Optional<List<Producto>> findByNombreAndPrecioVentaOrderByPrecioVentaDesc(String nombre, Double precioVenta) {
        return productoCrudRepository.findByNombreAndPrecioVentaOrderByPrecioVentaDesc(nombre, precioVenta);
    }

    /*
    public Optional<List<Producto>> findByCantidadStockLessThan(Integer stock) {
        return productoCrudRepository.findByCantidadStockLessThan(stock);
    }

    public Optional<List<Producto>> findByCantidadStockLessThanAndIdCategoriaOrderByStockDesc(Integer stock, Long idCantidad) {
        return productoCrudRepository.findByCantidadStockLessThanAndIdCategoriaOrderByStockDesc(stock, idCantidad);
    }
     */
}
