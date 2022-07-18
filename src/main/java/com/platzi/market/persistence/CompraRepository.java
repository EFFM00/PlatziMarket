package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.CompraCrudRepository;
import com.platzi.market.persistence.entity.Compra;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class CompraRepository {

    private CompraCrudRepository compraCrudRepository;

    public List<Compra> findAll() {
        return (List<Compra>) compraCrudRepository.findAll();
    }

    public void deleteById(Long id){
        compraCrudRepository.deleteById(id);
    }

    public Compra save(Compra compra){
        return compraCrudRepository.save(compra);
    }

    public Optional<Compra> findById(Long id){
        return compraCrudRepository.findById(id);
    }

    public Optional<List<Compra>> findByIdCliente(String id){
        return compraCrudRepository.findByIdCliente(id);
    }

    public Optional<List<Compra>> findByFecha(LocalDateTime fecha){
        return compraCrudRepository.findByFecha(fecha);
    }

    public Optional<List<Compra>> findByMedioPago(String medioPago){
        return compraCrudRepository.findByMedioPago(medioPago);
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
