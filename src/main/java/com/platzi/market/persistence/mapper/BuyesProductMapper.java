package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.BuyesProductDto;
import com.platzi.market.persistence.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {
        BuyesProductMapper.class,
        BuyMapper.class
})
public interface BuyesProductMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "cantidad", target = "stock"),
            @Mapping(source = "total", target = "total"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "producto", target = "product"),
            @Mapping(source = "compra", target = "buy"),
    })
    BuyesProductDto toBuyesProductDto(ComprasProducto comprasProducto);

    @InheritInverseConfiguration
    ComprasProducto toComprasProucto(BuyesProductDto buyesProductDto);
}
