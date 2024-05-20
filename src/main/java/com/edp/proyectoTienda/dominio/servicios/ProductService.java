package com.edp.proyectoTienda.dominio.servicios;

import com.edp.proyectoTienda.dominio.Product;
import com.edp.proyectoTienda.dominio.repositorio.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    ProductRepository productRepository;

    public void createProduct(Product product){
        productRepository.createProduct(product);
    }
    public List<Product> getAll(){
        return productRepository.getAll();
    }
    public List<Product> getPricesLessThan(int precio){
        return productRepository.getPricesLessThan(precio);
    }
    public List<Product> getPricesGreaterThan(int precio){
        return productRepository.getPricesGreaterThan(precio);
    }
    public long countProduct(){
       return productRepository.countProduct();
    }
    public void deleteById(int id){
        productRepository.deleteById(id);
    }
    public List<Product> findByCategory(int id){
        return productRepository.findByCategory(id);
    }
    public List<Product> findStockLess(int amount){
        return productRepository.findStockLess(amount);
    }
}
