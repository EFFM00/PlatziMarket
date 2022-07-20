package com.platzi.market.domain.repository;

import com.platzi.market.domain.BuyesProductDto;
import com.platzi.market.persistence.entity.ComprasProductoPK;

import java.util.List;
import java.util.Optional;

public interface BuyesProductDtoRepository {

    List<BuyesProductDto> findAll();

    void delete(ComprasProductoPK id);

    BuyesProductDto save(BuyesProductDto buyesProductDto);

    List<BuyesProductDto> findByStock(Integer stock);
}
