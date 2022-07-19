package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CategoriaCrudRepository extends CrudRepository<Categoria, Long> {

    Optional<List<Categoria>> findByEstado(Boolean estado);

    Optional<List<Categoria>> findByEstadoAndIdCategoria(Boolean estado, Long idCategoria);

    Optional<List<Categoria>> findByDescripcion(String descripcion);
}
