package com.edp.proyectoTienda.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edp.proyectoTienda.dominio.Client;
import com.edp.proyectoTienda.dominio.repositorio.ClientRepository;
import com.edp.proyectoTienda.persistencia.crud.ClientesCrudRepository;
import com.edp.proyectoTienda.persistencia.entities.Clientes;
import com.edp.proyectoTienda.persistencia.mappers.ClientMapper;

@Repository
public class ClientesRepository implements ClientRepository{
    @Autowired
    private ClientesCrudRepository clientesCrudRepository;
    @Autowired
    private ClientMapper mapper;

    @Override
    public void createClient(Client client){
        Clientes clientes = mapper.toClientes(client);
        clientesCrudRepository.save(clientes);
    }
    @Override
    public void deleteClientById(int id){
        clientesCrudRepository.deleteById(id);
    }
    @Override
    public List<Client> getAll(){
        List<Clientes> clientes = (List<Clientes>) clientesCrudRepository.findAll();
        return mapper.toClients(clientes);
    }
    @Override
    public long countClient(){
        return clientesCrudRepository.count();
    }
    @Override
    public void updateClient(Client client) {
        Clientes existingClient = clientesCrudRepository.findById(client.getId())
                .orElseThrow(() -> new IllegalArgumentException("No se encontró el cliente"));
    
        Clientes updatedClient = mapper.toClientes(client);
        updatedClient.setId(existingClient.getId());

        clientesCrudRepository.save(updatedClient);
    }
    @Override
    public List<Client> findByName(String name){
        return (List<Client>)mapper.toClients(clientesCrudRepository.findByNombre(name));
    }
    @Override
    public List<Client> findByMail(String mail){
        return (List<Client>)mapper.toClients(clientesCrudRepository.findByCorreoElectronico(mail));
    }
    
}
