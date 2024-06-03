package com.edp.proyectoTienda.persistencia.mappers;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.edp.proyectoTienda.dominio.Client;
import com.edp.proyectoTienda.persistencia.entities.Clientes;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    @Mappings({
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "nombre", target = "name"),
        @Mapping(source = "apellidos", target = "lastNames"),
        @Mapping(source = "celular", target = "celphone"),
        @Mapping(source = "direccion", target = "adress"),
        @Mapping(source = "correoElectronico", target = "mail")
    })
    Client toClient(Clientes clientes);
    
    List<Client> toClients(List<Clientes> clientes);
    
    @InheritInverseConfiguration
    Clientes toClientes(Client client);
}
