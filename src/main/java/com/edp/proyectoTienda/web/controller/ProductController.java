package com.edp.proyectoTienda.web.controller;

import com.edp.proyectoTienda.dominio.Product;
import com.edp.proyectoTienda.dominio.servicios.ProductService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }
    @PostMapping("/new")
    public ResponseEntity<Void> createProduct(@RequestBody Product product){
        productService.createProduct(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProductById(@PathVariable int id){
        productService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Void> updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/byPrices/LessThan/{price}")
    public List<Product> getPricesLessThan(@PathVariable int price){
        return productService.getPricesLessThan(price);
    }
    @GetMapping("/byPrices/GreaterThan/{price}")
    public List<Product> getPricesGreaterThan (@PathVariable int price){
        return productService.getPricesGreaterThan(price);
    }
    @GetMapping("/count")
    public long countProduct(){
        return productService.countProduct();
    }
    @GetMapping("/byCategory/{id}")
    public List<Product> findByCategory(@PathVariable int id){
        return productService.findByCategory(id);
    }
    @GetMapping("/byStock/less/{amount}")
    public List<Product> findStockLess(@PathVariable int amount){
        return productService.findStockLess(amount);
    }
}
