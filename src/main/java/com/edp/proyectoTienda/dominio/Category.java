package com.edp.proyectoTienda.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private int categoryId;
    private String description;
    private Boolean state;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
