package com.pacadmin.banchilechallenge.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
