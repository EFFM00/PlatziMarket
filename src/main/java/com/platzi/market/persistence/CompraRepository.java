package com.platzi.market.persistence;

import com.platzi.market.domain.BuyDto;
import com.platzi.market.domain.repository.BuyDtoRepository;
import com.platzi.market.persistence.crud.CompraCrudRepository;
import com.platzi.market.persistence.entity.Compra;
import com.platzi.market.persistence.mapper.BuyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements BuyDtoRepository {
    @Autowired
    private BuyMapper mapper;
    @Autowired
    private CompraCrudRepository compraCrudRepository;

    @Override
    public List<BuyDto> findAll() {
        List<Compra> compras = (List<Compra>) compraCrudRepository.findAll();
        return mapper.toBuyes(compras);
    }

    public void deleteById(Long id){
        compraCrudRepository.deleteById(id);
    }

    @Override
    public BuyDto save(BuyDto buyDto) {
        return mapper.toBuyDto(compraCrudRepository.save(mapper.toCompra(buyDto)));
    }

    @Override
    public Optional<BuyDto> findByClientId(String id) {
        return compraCrudRepository.findByIdCliente(id).map(compra -> mapper.toBuyDto(compra));
    }

    @Override
    public List<BuyDto> findByDate(LocalDateTime date) {
        List<Compra> compras = compraCrudRepository.findByFecha(date);
        return mapper.toBuyes(compras);
    }

    @Override
    public List<BuyDto> findByPaymentMethod(String paymentMethod) {
        List<Compra> compras = compraCrudRepository.findByMedioPago(paymentMethod);
        return mapper.toBuyes(compras);
    }

    public Optional<Compra> findById(Long id){
        return compraCrudRepository.findById(id);
    }

    public Optional<Compra> findByIdCliente(String id){
        return compraCrudRepository.findByIdCliente(id);
    }

    public Optional<List<Compra>> findByFechaAndIdCliente(LocalDateTime fecha, Integer idCliente){
        return compraCrudRepository.findByFechaAndIdClienteOrderByIdClienteAsc(fecha, idCliente);
    }

    public Optional<List<Compra>> findByFechaAndIdClienteAndMedioPago(LocalDateTime fecha, Integer idCliente, String medioPago){
        return compraCrudRepository.findByFechaAndIdClienteAndMedioPagoOrderByFechaAsc(fecha, idCliente, medioPago);
    }

    public Optional<List<Compra>> findByEstado(String estado){
        return compraCrudRepository.findByEstado(estado);
    }

}
