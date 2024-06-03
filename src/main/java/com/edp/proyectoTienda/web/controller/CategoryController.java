package com.edp.proyectoTienda.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.edp.proyectoTienda.dominio.Category;
import com.edp.proyectoTienda.dominio.servicios.CategoryService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getAll(){
        return categoryService.getAll();
    }
    @PostMapping("/new")   
    public ResponseEntity<Void> createCategory(@RequestBody Category category){
        categoryService.createCategory(category);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCategoryId(@PathVariable int id){
        categoryService.deleteCategoryId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/count")
    public long countCategory(){
       return categoryService.countCategory();
    }
    @GetMapping("/byName/{name}")
    public List<Category> getCategoryByName(@PathVariable String name){
        return categoryService.getCategoryByName(name);
    }
    @GetMapping("/byState/{state}")
    public List<Category> getCategoryByState(@PathVariable Boolean state){
        return categoryService.getCategoryByState(state);
    }
}
