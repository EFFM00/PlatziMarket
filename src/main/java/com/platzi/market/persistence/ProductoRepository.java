package com.platzi.market.persistence;

import com.platzi.market.domain.ProductDto;
import com.platzi.market.domain.repository.ProductDtoRepository;
import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;
import com.platzi.market.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductDtoRepository {

    @Autowired
    private ProductoCrudRepository productoCrudRepository;
    @Autowired
    private ProductMapper mapper;

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

    @Override
    public Optional<ProductDto> getById(Long id) {
        return productoCrudRepository.findById(id).map(producto -> mapper.toProductDto(producto));
    }

    @Override
    public List<ProductDto> getAll() {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public void delete(Long id) {
        productoCrudRepository.deleteById(id);
    }

    @Override
    public ProductDto save(ProductDto product) {
        return mapper.toProductDto(productoCrudRepository.save(mapper.toProducto(product)));
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
