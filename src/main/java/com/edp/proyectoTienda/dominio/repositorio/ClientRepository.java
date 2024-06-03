package com.edp.proyectoTienda.dominio.repositorio;

import java.util.List;

import com.edp.proyectoTienda.dominio.Client;

public interface ClientRepository {
    void createClient(Client client);
    void deleteClientById(int id);
    List<Client> getAll();
    long countClient();
    void updateClient(Client client);
    List<Client> findByName(String name);
    List<Client> findByMail(String mail);
}
