package com.edp.proyectoTienda.dominio.repositorio;

import java.util.Date;
import java.util.List;

import com.edp.proyectoTienda.dominio.Purchase;

public interface PurchaseRepository {
    void createCompra(Purchase purchase);
    void deleteCompraId(int id);
    List<Purchase> getPurchaseBefore(Date fecha);
    List<Purchase> getPurchaseAfter(Date fecha);
    List<Purchase> getAll();
    long countPurchases();
    List<Purchase> purchaseByIdClient(String idClient);

}
