package com.edp.proyectoTienda.dominio.repositorio;

import com.edp.proyectoTienda.dominio.Product;

import java.util.List;

public interface ProductRepository {
    void createProduct(Product product);
    List<Product> getAll();
    List<Product> getPricesLessThan(int precio);
    List<Product> getPricesGreaterThan(int precio);
    long countProduct();
    void deleteById(int id);
    List<Product> findByCategory(int id);
    List<Product> findStockLess(int amount);
    void updateProduct(Product product);
}
