package com.edp.proyectoTienda.dominio.servicios;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edp.proyectoTienda.dominio.Purchase;
import com.edp.proyectoTienda.dominio.repositorio.PurchaseRepository;

@Service
public class PurchaseService {
    @Autowired
    PurchaseRepository purchaseRepository;

    public void createPurchase(Purchase purchase){
        purchaseRepository.createCompra(purchase);
    }
    public void deleteCompraId(int id){
        purchaseRepository.deleteCompraId(id);
    }
    public List<Purchase> getPurchaseBefore(Date date){
        return purchaseRepository.getPurchaseBefore(date);
    }
    public List<Purchase> getPurchaseAfter(Date date){
        return purchaseRepository.getPurchaseAfter(date);
    }
    public List<Purchase> getAll(){
        return purchaseRepository.getAll();
    }
    public long countPurchases(){
        return purchaseRepository.countPurchases();
    }
    public List<Purchase> getPurchasesByIdClient(String idClient){
        return purchaseRepository.purchaseByIdClient(idClient);
    }
}
