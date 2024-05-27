package com.edp.proyectoTienda.dominio.repositorio;

import java.util.List;

import com.edp.proyectoTienda.dominio.Category;

public interface CategoryRepository {

    void createCategory(Category category);
    void deleteCategoryId(int id);
    List<Category> getAll();
    long countCategory();
    List<Category> getCategoryByName(String name);
    List<Category> getCategoryByState(Boolean state);

}
