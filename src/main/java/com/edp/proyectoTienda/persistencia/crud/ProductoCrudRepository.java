package com.edp.proyectoTienda.persistencia.crud;

import com.edp.proyectoTienda.persistencia.entities.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoria(int id);
    List<Producto> findByCantidadStockLessThan(int cantidad);

    List<Producto> findbyPrecioLessThan(int precio);
    List<Producto> findByPrecioGreaterThan(int precio);


}
