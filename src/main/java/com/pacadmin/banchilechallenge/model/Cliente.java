package com.pacadmin.banchilechallenge.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Column(name = "id_cliente")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(name = "rut")
    private String rut;

    @Column(name = "nombre")
    private String nombre;
}
