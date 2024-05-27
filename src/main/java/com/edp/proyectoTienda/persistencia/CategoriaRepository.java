package com.edp.proyectoTienda.persistencia;

import com.edp.proyectoTienda.dominio.Category;
import com.edp.proyectoTienda.dominio.repositorio.CategoryRepository;
import com.edp.proyectoTienda.persistencia.crud.CategoriaCrudRepository;
import com.edp.proyectoTienda.persistencia.entities.Categoria;
import com.edp.proyectoTienda.persistencia.mappers.CategoryMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriaRepository implements CategoryRepository {

    @Autowired
    private CategoriaCrudRepository categoriaCrudRepository;
    @Autowired
    private CategoryMapper mapper;

    @Override
    public void createCategory(Category category){
        Categoria categoria = mapper.toCategoria(category);
        categoriaCrudRepository.save(categoria);
    }
    @Override
    public void deleteCategoryId(int id){
        categoriaCrudRepository.deleteById(id);
    }
    @Override
    public List<Category> getAll(){
        List<Categoria> categorias= (List<Categoria>) categoriaCrudRepository.findAll();
        return mapper.toCategory(categorias);
    }
    @Override
    public long countCategory(){
        return categoriaCrudRepository.count();
    }
    @Override
    public List<Category> getCategoryByName(String nombre){
       List<Categoria> categorias = categoriaCrudRepository.findByDescripcion(nombre);
        return mapper.toCategory(categorias);
    }
    @Override
    public List<Category> getCategoryByState(Boolean estado){
        List<Categoria> categorias = categoriaCrudRepository.findByEstado(estado);
        return mapper.toCategory(categorias);
    }

}
