package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ClienteCrudRepository;
import com.platzi.market.persistence.entity.Cliente;

import java.util.List;
import java.util.Optional;

public class ClienteRepository {

    private ClienteCrudRepository clienteCrudRepository;

    public List<Cliente> findAll() {
        return (List<Cliente>) clienteCrudRepository.findAll();
    }

    public void deleteById(String id){
        clienteCrudRepository.deleteById(id);
    }

    public Cliente save(Cliente cliente){
        return clienteCrudRepository.save(cliente);
    }

    public Optional<Cliente> findById(String id){
        return clienteCrudRepository.findById(id);
    }

    public Optional<List<Cliente>> findByNombre(String nombre){
        return clienteCrudRepository.findByNombre(nombre);
    }

    public Optional<List<Cliente>> findByApellido(String apellido){
        return clienteCrudRepository.findByApellido(apellido);
    }

    public Optional<List<Cliente>> findByCelular(Integer celular){
        return clienteCrudRepository.findByCelular(celular);
    }

    public Optional<List<Cliente>> findByDireccion(String direccion){
        return clienteCrudRepository.findByDireccion(direccion);
    }

    public Optional<List<Cliente>> findByEmail(String email){
        return clienteCrudRepository.findByEmail(email);
    }

    public Optional<List<Cliente>> findByNombreAndApellido(String nombre, String apellido){
        return clienteCrudRepository.findByNombreAndApellido(nombre, apellido);
    }

}

