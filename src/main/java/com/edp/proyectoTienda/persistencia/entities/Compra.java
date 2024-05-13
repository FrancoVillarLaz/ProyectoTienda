package com.edp.proyectoTienda.persistencia.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_cliente")
    private Integer idCliente;
    private Date fecha;
    @Column(name = "medio_pago")
    private String medioPago;
    private String comentario;
    private Boolean estado;

    @OneToMany(mappedBy = "compra")
    private List<CompraProducto> productos;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false,updatable = false)
    private Clientes cliente;
}
