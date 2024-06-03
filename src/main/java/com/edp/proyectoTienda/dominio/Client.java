package com.edp.proyectoTienda.dominio;

public class Client {
    private String id;
    private String name;
    private String lastNames;
    private double celphone;
    private String adress; 
    private String mail;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastNames() {
        return lastNames;
    }
    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }
    public double getCelphone() {
        return celphone;
    }
    public void setCelphone(double celphone) {
        this.celphone = celphone;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    
}
