package com.edp.proyectoTienda.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.edp.proyectoTienda.dominio.Category;
import com.edp.proyectoTienda.dominio.servicios.CategoryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getAll(){
        return categoryService.getAll();
    }

}
