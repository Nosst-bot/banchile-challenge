package com.pacadmin.banchilechallenge.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clientes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private Long clienteId;

    @Column(name = "rut")
    private String clienteRut;

    @Column(name = "nombre")
    private String clienteNombre;
}
