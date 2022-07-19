package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.BuyDto;
import com.platzi.market.persistence.entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface BuyMapper {

    @Mappings({
            @Mapping(source = "idCompra", target = "buyId"),
            @Mapping(source = "idCliente", target = "clientId"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "medioPago", target = "paymentMethod"),
            @Mapping(source = "productos", target = "products")
    })
    BuyDto toBuyDto(Compra compra);

    @InheritInverseConfiguration
    @Mapping(target = "comentario", ignore = true)
    Compra toCompra(BuyDto buy);
}
