package com.edp.proyectoTienda.persistencia;

import com.edp.proyectoTienda.persistencia.crud.ProductoCrudRepository;
import com.edp.proyectoTienda.persistencia.entities.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public void createProducto(Producto producto){
        productoCrudRepository.save(producto);
    }

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public long countProducto(){
        return productoCrudRepository.count();
    }
    public void deleteProductoId(int id){
        productoCrudRepository.deleteById(id);

    }
    public List<Producto> findByCategory(int id){
        return productoCrudRepository.findByIdCategoria(id);
    }

    public List<Producto> StockBajo(int cantidad){
        return (List<Producto>) productoCrudRepository.findByCantidadStockLessThan(cantidad);
    }
}
