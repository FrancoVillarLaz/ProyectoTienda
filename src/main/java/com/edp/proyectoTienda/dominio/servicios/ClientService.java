package com.edp.proyectoTienda.dominio.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edp.proyectoTienda.dominio.Client;
import com.edp.proyectoTienda.dominio.repositorio.ClientRepository;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public void createClient(Client client){
        clientRepository.createClient(client);
    }
    public void deleteClientById(int id){
        clientRepository.deleteClientById(id);
    }
    public List<Client> getAll(){
        return clientRepository.getAll();
    }
    public long countClient(){
        return clientRepository.countClient();
    }
    public void updateClient(Client client){
        clientRepository.updateClient(client);
    }
    public List<Client> findByName(String name){
       return clientRepository.findByName(name);
    }
    public List<Client> findByMail(String mail){
        return clientRepository.findByMail(mail);
    }
}
