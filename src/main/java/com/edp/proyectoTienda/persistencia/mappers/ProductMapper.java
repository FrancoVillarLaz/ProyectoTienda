package com.edp.proyectoTienda.persistencia.mappers;

import com.edp.proyectoTienda.dominio.Product;
import com.edp.proyectoTienda.persistencia.entities.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "categoria", target = "category"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "estado", target = "state"),
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> producto);
    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "cantidadStock", ignore = true),
            @Mapping(target = "codigoBarras", ignore = true),
    })
    Producto toProducto(Product product);
}
