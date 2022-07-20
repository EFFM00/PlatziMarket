package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Cliente;
import com.platzi.market.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface ClienteCrudRepository extends CrudRepository<Cliente, String> {

    Optional<List<Cliente>> findByNombre(String nombre);

    Optional<List<Cliente>> findByApellidos(String apellidos);

    List<Cliente> findByNombreAndApellidos(String nombre, String apellidos);

    Optional<List<Cliente>> findByCelular(Integer celular);

    Optional<List<Cliente>> findByDireccion(String direccion);

    Optional<List<Cliente>> findByEmail(String email);
}
