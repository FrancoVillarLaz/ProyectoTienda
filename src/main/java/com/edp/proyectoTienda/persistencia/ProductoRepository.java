package com.edp.proyectoTienda.persistencia;

import com.edp.proyectoTienda.dominio.Product;
import com.edp.proyectoTienda.dominio.repositorio.ProductRepository;
import com.edp.proyectoTienda.persistencia.crud.ProductoCrudRepository;
import com.edp.proyectoTienda.persistencia.entities.Producto;
import com.edp.proyectoTienda.persistencia.mappers.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductoRepository implements ProductRepository {

    @Autowired
    private ProductoCrudRepository productoCrudRepository;
    @Autowired
    private ProductMapper mapper;

    @Override
    public void createProduct(Product product) {
        Producto producto = mapper.toProducto(product);
        productoCrudRepository.save(producto);
    }

    @Override
    public List<Product> getAll() {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public void updateProduct(Product product) {
        Producto existingProduct = productoCrudRepository.findById(product.getProductId())
                .orElseThrow(() -> new IllegalArgumentException("Producto no encontrado"));

        Producto updatedProduct = mapper.toProducto(product);

        updatedProduct.setIdProducto(existingProduct.getIdProducto());
        updatedProduct.setCantidadStock(existingProduct.getCantidadStock());
        updatedProduct.setCodigoBarras(existingProduct.getCodigoBarras());

        productoCrudRepository.save(updatedProduct);
    }

    @Override
    public List<Product> getPricesLessThan(int precio) {
        List<Producto> productos = productoCrudRepository.findByPrecioVentaLessThan(precio);
        return mapper.toProducts(productos);
    }

    @Override
    public List<Product> getPricesGreaterThan(int precio) {
        List<Producto> productos = productoCrudRepository.findByPrecioVentaGreaterThan(precio);
        return mapper.toProducts(productos);
    }

    @Override
    public long countProduct() {
        return productoCrudRepository.count();
    }

    @Override
    public void deleteById(int id) {
        productoCrudRepository.deleteById(id);
    }

    @Override
    public List<Product> findByCategory(int id) {
        List<Producto> productos = productoCrudRepository.findByIdCategoria(id);
        return mapper.toProducts(productos);
    }

    @Override
    public List<Product> findStockLess(int amount) {
        List<Producto> productos = productoCrudRepository.findByCantidadStockLessThan(amount);
        return mapper.toProducts(productos);
    }
}
