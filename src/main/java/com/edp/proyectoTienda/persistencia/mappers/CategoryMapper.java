package com.edp.proyectoTienda.persistencia.mappers;

import com.edp.proyectoTienda.dominio.Category;
import com.edp.proyectoTienda.persistencia.entities.Categoria;
// import lombok.Getter;
// import lombok.Setter;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

// @Getter
// @Setter
@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "estado", target = "state"),
    })
    Category toCategory(Categoria categoria);
    List<Category> toCategory(List<Categoria> categoria);
    @InheritInverseConfiguration
    @Mapping(target = "producto",ignore = true)
    Categoria toCategoria(Category category);
}
