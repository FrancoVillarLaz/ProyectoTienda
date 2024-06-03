package com.edp.proyectoTienda.persistencia.mappers;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.edp.proyectoTienda.dominio.Purchase;
import com.edp.proyectoTienda.persistencia.entities.Compra;

@Mapper(componentModel = "spring")
public interface PurchaseMapper {
    @Mappings({
        @Mapping(source = "idCompra", target = "idPurchase"),
        @Mapping(source = "idCliente", target = "idClient"),
        @Mapping(source = "fecha", target = "date"),
        @Mapping(source = "comentario", target = "comment")
        })
    Purchase toPurchase(Compra compra);
    List<Purchase> toPurchases(List<Compra> compra);
    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "estado", ignore = true),
        @Mapping(target = "medioPago", ignore = true)
    })
    Compra toCompra(Purchase purchase);
}