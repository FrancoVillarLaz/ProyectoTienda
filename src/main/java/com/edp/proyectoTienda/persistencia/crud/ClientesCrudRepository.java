package com.edp.proyectoTienda.persistencia.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.edp.proyectoTienda.persistencia.entities.Clientes;

public interface ClientesCrudRepository extends CrudRepository<Clientes, Integer>{
    List<Clientes> findByNombre(String nombre);
    Optional<Clientes> findById(String id);
    List<Clientes> findByCorreoElectronico(String correo);
}
