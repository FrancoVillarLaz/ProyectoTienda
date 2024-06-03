package com.edp.proyectoTienda.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edp.proyectoTienda.dominio.Client;
import com.edp.proyectoTienda.dominio.servicios.ClientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAll(){
        return clientService.getAll();
    }
    @PostMapping("/new")
    public ResponseEntity<Void> createClient(@RequestBody Client client ) {
        clientService.createClient(client);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable int id ){
        clientService.deleteClientById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Void> updateClient(Client client){
        clientService.updateClient(client);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/count")
    public long countClient() {
        return clientService.countClient();
    }
    @GetMapping("/findByName/{name}")
    public List<Client> findByname(@PathVariable String name) {
        return clientService.findByName(name);
    }
    @GetMapping("/findByMail/{mail}")
    public List<Client> getfindByMail(@PathVariable String mail) {
        return clientService.findByMail(mail);
    }
    
    
}
