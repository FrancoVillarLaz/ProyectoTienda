package com.edp.proyectoTienda.persistencia.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Integer idCategoria;

    private String descripcion;
    private Boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> Producto;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<com.edp.proyectoTienda.persistencia.entities.Producto> getProducto() {
        return Producto;
    }

    public void setProducto(List<com.edp.proyectoTienda.persistencia.entities.Producto> producto) {
        Producto = producto;
    }
}
