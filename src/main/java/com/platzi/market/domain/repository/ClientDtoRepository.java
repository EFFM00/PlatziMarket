package com.platzi.market.domain.repository;

import com.platzi.market.domain.ClientDto;

import java.util.List;
import java.util.Optional;

public interface ClientDtoRepository {

    List<ClientDto> getAll();

    void delete(String id);

    ClientDto save(ClientDto client);

    List<ClientDto> findByNameAndLastname(String name, String lastname);
}
