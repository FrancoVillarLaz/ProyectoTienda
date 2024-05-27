package com.edp.proyectoTienda.dominio.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edp.proyectoTienda.dominio.Category;
import com.edp.proyectoTienda.dominio.repositorio.CategoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;

    public void createCategory(Category category){
        categoryRepository.createCategory(category);
    }
    public void deleteCategoryId(int id){
        categoryRepository.deleteCategoryId(id);
    }
    public List<Category> getAll(){
        return categoryRepository.getAll();
    }
    public long countCategory(){
        return categoryRepository.countCategory();
    }
    public List<Category> getCategoryByName(String name){
        return categoryRepository.getCategoryByName(name);
    }
    public List<Category> getCategoryByState(Boolean state){
        return categoryRepository.getCategoryByState(state);
    }

}
