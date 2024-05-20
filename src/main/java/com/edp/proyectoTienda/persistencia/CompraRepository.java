package com.edp.proyectoTienda.persistencia;

import com.edp.proyectoTienda.persistencia.crud.CompraCrudRepository;
import com.edp.proyectoTienda.persistencia.entities.Categoria;
import com.edp.proyectoTienda.persistencia.entities.Compra;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public class CompraRepository {
    private CompraCrudRepository compraCrudRepository;

    public void createCompra(Compra compra){
        compraCrudRepository.save(compra);
    }
    public void deleteCompraId(int id){
        compraCrudRepository.deleteById(id);
    }
    public List<Compra> getComprasAntesDe(Date fecha){
        return compraCrudRepository.findByFechaBefore(fecha);
    }
    public List<Compra> getComprasDespuesDe(Date fecha){
        return compraCrudRepository.findByFechaAfter(fecha);
    }
    public List<Compra> getAll(){
        return (List<Compra>) compraCrudRepository.findAll();
    }
    public long countCategoria(){
        return compraCrudRepository.count();
    }
    public List<Compra> getCategoriasByEstado(Boolean estado){
        return compraCrudRepository.findByEstado(estado);
    }

}
