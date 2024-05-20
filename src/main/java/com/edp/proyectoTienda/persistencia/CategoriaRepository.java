package com.edp.proyectoTienda.persistencia;

import com.edp.proyectoTienda.persistencia.crud.CategoriaCrudRepository;
import com.edp.proyectoTienda.persistencia.entities.Categoria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriaRepository {
    CategoriaCrudRepository categoriaCrudRepository;

    public void createCategoria(Categoria categoria){
        categoriaCrudRepository.save(categoria);
    }
    public void deleteCategoriaId(int id){
        categoriaCrudRepository.deleteById(id);
    }
    public List<Categoria> getAll(){
        return (List<Categoria>) categoriaCrudRepository.findAll();
    }
    public long countCategoria(){
        return categoriaCrudRepository.count();
    }
    public List<Categoria> getCategoriasByNombre(String nombre){
        return categoriaCrudRepository.findByNombre(nombre);
    }
    public List<Categoria> getCategoriasByEstado(Boolean estado){
        return categoriaCrudRepository.findByEstado(estado);
    }

}
