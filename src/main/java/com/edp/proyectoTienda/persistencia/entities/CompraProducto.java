package com.edp.proyectoTienda.persistencia.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "compras_productos")
public class CompraProducto {
    @EmbeddedId
    private CompraProductoPK id;

    private Integer cantidad;
    private Integer total;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;
    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

}
