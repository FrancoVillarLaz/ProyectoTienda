package com.edp.proyectoTienda.persistencia.crud;

import com.edp.proyectoTienda.persistencia.entities.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoriaCrudRepository extends CrudRepository<Categoria, Integer> {
    List<Categoria> findByDescripcion(String descripcion);
    List<Categoria> findByEstado(Boolean estado);
}
