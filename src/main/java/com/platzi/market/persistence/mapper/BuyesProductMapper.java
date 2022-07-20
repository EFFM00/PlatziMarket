package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.BuyesProductDto;
import com.platzi.market.persistence.entity.Compra;
import com.platzi.market.persistence.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {
        ProductMapper.class,
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
    List<BuyesProductDto> toBuyesList(List<ComprasProducto> comprasProductos);

    @InheritInverseConfiguration
    ComprasProducto toComprasProucto(BuyesProductDto buyesProductDto);
}
