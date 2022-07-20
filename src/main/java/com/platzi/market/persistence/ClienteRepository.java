package com.platzi.market.persistence;

import com.platzi.market.domain.ClientDto;
import com.platzi.market.domain.repository.ClientDtoRepository;
import com.platzi.market.persistence.crud.ClienteCrudRepository;
import com.platzi.market.persistence.entity.Cliente;
import com.platzi.market.persistence.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository implements ClientDtoRepository {

    @Autowired
    private ClientMapper mapper;
    @Autowired
    private ClienteCrudRepository clienteCrudRepository;

    public List<Cliente> findAll() {
        return (List<Cliente>) clienteCrudRepository.findAll();
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
        return clienteCrudRepository.findByApellidos(apellido);
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

    @Override
    public List<ClientDto> getAll() {
        List<Cliente> clientes = (List<Cliente>) clienteCrudRepository.findAll();
        return mapper.toListClientDto(clientes);
    }

    @Override
    public void delete(String id) {
        clienteCrudRepository.deleteById(id);
    }

    @Override
    public ClientDto save(ClientDto client) {
        return mapper.toClientDto(clienteCrudRepository.save(mapper.toCliente(client)));
    }

    @Override
    public List<ClientDto> findByNameAndLastname(String name, String lastname) {
        List<Cliente> clientes = (List<Cliente>) clienteCrudRepository.findByNombreAndApellidos(name, lastname);
        return mapper.toListClientDto(clientes);
    }
}

