package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.BuyDto;
import com.platzi.market.domain.ProductDto;
import com.platzi.market.persistence.entity.Compra;
import com.platzi.market.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {
        BuyesProductMapper.class,
        ClientMapper.class
})
public interface BuyMapper {

    @Mappings({
            @Mapping(source = "idCompra", target = "buyId"),
            @Mapping(source = "idCliente", target = "clientId"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "medioPago", target = "paymentMethod"),
            @Mapping(source = "cliente", target = "client")
    })
    BuyDto toBuyDto(Compra compra);

    List<BuyDto> toBuyes(List<Compra> compras);
    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "comentario", ignore = true),
            @Mapping(target = "productos", ignore = true)
    })
    Compra toCompra(BuyDto buy);
}
