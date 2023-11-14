package com.pacadmin.banchilechallenge.model;

import java.util.Date;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pac")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PAC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pac_id")
    private Long pacId;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(name = "fecha")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pacFecha;

    @Column(name = "monto")
    private Integer pacMonto;
}
