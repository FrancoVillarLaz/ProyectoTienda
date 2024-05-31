package com.edp.proyectoTienda.dominio;

import java.sql.Date;

public class Purchase {
    private int idPurchase;
    private int idClient;
    private Date date;
    private String medioPago;
    private String coment;
    private Boolean state;
    
    public int getIdPurchase() {
        return idPurchase;
    }
    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }
    public int getIdClient() {
        return idClient;
    }
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getMedioPago() {
        return medioPago;
    }
    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
    public String getComent() {
        return coment;
    }
    public void setComent(String coment) {
        this.coment = coment;
    }
    public Boolean getState() {
        return state;
    }
    public void setState(Boolean state) {
        this.state = state;
    }
    
}
