package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra, Long> {

    Optional<Compra> findByIdCliente(String idCliente);

    List<Compra> findByFecha(LocalDateTime fecha);

    List<Compra> findByMedioPago(String medioPago);

    Optional<List<Compra>> findByEstado(String estado);

    Optional<List<Compra>> findByFechaAndIdClienteOrderByIdClienteAsc(LocalDateTime fecha, Integer idCliente);

    Optional<List<Compra>> findByFechaAndIdClienteAndMedioPagoOrderByFechaAsc(LocalDateTime fecha, Integer idCliente, String medioPago);
}
