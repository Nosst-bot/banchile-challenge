package com.pacadmin.banchilechallenge.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cuentas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cuenta_id")
    private Long cuentaId;

    @Column(name = "nombre_banco")
    private String cuentaNombreBanco;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
