package com.platzi.market.domain.repository;

import com.platzi.market.domain.BuyDto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface BuyDtoRepository {

    List<BuyDto> findAll();

    void deleteById(Long id);

    BuyDto save(BuyDto BuyDto);

    Optional<BuyDto> findByClientId(String id);

    List<BuyDto> findByDate(LocalDateTime date);

    List<BuyDto> findByPaymentMethod(String paymentMethod);
}
