package com.edp.proyectoTienda.dominio;

import java.sql.Date;

public class Purchase {
    private int idPurchase;
    private String idClient;
    private Date date;
    private String comment;

    public int getIdPurchase() {
        return idPurchase;
    }
    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }
    public String getIdClient() {
        return idClient;
    }
    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    
}
