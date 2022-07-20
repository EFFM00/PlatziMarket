package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.CategoryDto;
import com.platzi.market.domain.ClientDto;
import com.platzi.market.persistence.entity.Categoria;
import com.platzi.market.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mappings({
            @Mapping(source = "idCliente", target = "clientId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellidos", target = "lastname"),
            @Mapping(source = "email", target = "email")
    })
    ClientDto toClientDto(Cliente cliente);
    List<ClientDto> toListClientDto(List<Cliente> clientes);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "celular", ignore = true),
            @Mapping(target = "direccion", ignore = true),
            @Mapping(target = "compras", ignore = true)
    })

    Cliente toCliente(ClientDto clientDto);
}
