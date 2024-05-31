package com.edp.proyectoTienda.persistencia.crud;

import com.edp.proyectoTienda.persistencia.entities.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
    List<Compra> findByFechaBefore(Date fecha);
    List<Compra> findByFechaAfter(Date fecha);
    List<Compra> findByEstado(Boolean estado);
    List<Compra> findByidCliente(int idCliente);
}
