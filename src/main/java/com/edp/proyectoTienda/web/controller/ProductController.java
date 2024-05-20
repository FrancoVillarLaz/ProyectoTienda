package com.edp.proyectoTienda.web.controller;

import com.edp.proyectoTienda.dominio.Product;
import com.edp.proyectoTienda.dominio.servicios.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/Products")
    public List<Product> getAll(){
        return productService.getAll();
    }
}
