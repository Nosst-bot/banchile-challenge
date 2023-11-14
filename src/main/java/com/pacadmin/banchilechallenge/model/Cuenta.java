package com.pacadmin.banchilechallenge.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cuentas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cuenta {

    @Column(name = "id_cuenta")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCuenta;

    @Column(name = "nombre_banco")
    private String nombreBanco;


    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
