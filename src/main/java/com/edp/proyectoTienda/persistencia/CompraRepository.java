package com.edp.proyectoTienda.persistencia;

import com.edp.proyectoTienda.dominio.Purchase;
import com.edp.proyectoTienda.dominio.repositorio.PurchaseRepository;
import com.edp.proyectoTienda.persistencia.crud.CompraCrudRepository;
import com.edp.proyectoTienda.persistencia.entities.Compra;
import com.edp.proyectoTienda.persistencia.mappers.PurchaseMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class CompraRepository implements PurchaseRepository {
    @Autowired
    private CompraCrudRepository compraCrudRepository;
    private PurchaseMapper mapper;
    @Override
    public void createCompra(Purchase purchase){
        Compra compra = mapper.toCompra(purchase);
        compraCrudRepository.save(compra);
    }
    @Override
    public void deleteCompraId(int id){
        compraCrudRepository.deleteById(id);
    }
    @Override
    public List<Purchase> purchaseByIdClient(String idClient){
        List<Compra> compras =compraCrudRepository.findByidCliente(idClient);
        return mapper.toPurchases(compras);
    }
    @Override
    public List<Purchase> getPurchaseBefore(Date fecha){
        return mapper.toPurchases(compraCrudRepository.findByFechaBefore(fecha));
    }
    @Override
    public List<Purchase> getPurchaseAfter(Date fecha){
        return mapper.toPurchases(compraCrudRepository.findByFechaAfter(fecha));
    }
    @Override
    public List<Purchase> getAll(){
        List<Compra> compras = (List<Compra>) compraCrudRepository.findAll();
        return mapper.toPurchases(compras);
    }
    @Override
    public long countPurchases(){
        return compraCrudRepository.count();
    }
}
