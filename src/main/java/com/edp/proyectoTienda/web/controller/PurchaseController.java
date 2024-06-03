package com.edp.proyectoTienda.web.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edp.proyectoTienda.dominio.Purchase;
import com.edp.proyectoTienda.dominio.servicios.PurchaseService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {
    @Autowired
    PurchaseService purchaseService;

    @GetMapping
    public List<Purchase> getAll(){
        return purchaseService.getAll();
    }

    @PostMapping("/new")
    public void createPurchase(@RequestBody Purchase purchase){
        purchaseService.createPurchase(purchase);
    };

    @DeleteMapping("/delete/{id}")
    public void deletePurchase(@PathVariable int id){
        purchaseService.deleteCompraId(id);
    }
    @GetMapping("/byTime/Before/{date}")
    public List<Purchase> getPurchaseBefore(@PathVariable Date date){
        return purchaseService.getPurchaseBefore(date);
    }
    @GetMapping("/byTime/After/{date}")
    public List<Purchase> getPurchaseAfter(@PathVariable Date date){
        return purchaseService.getPurchaseAfter(date);
    }
    @GetMapping("/count")
    public long countPurchases(){
        return purchaseService.countPurchases();
    }
    @GetMapping("/byIdClient/{id}")
    public List<Purchase> purchaseByIdClient(@PathVariable String idClient){
        return purchaseService.getPurchasesByIdClient(idClient);
    }
}
