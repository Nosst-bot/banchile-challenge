package com.pacadmin.banchilechallenge.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "productos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producto_id")
    Long productoId;

    @Column(name = "nombre", unique = true)
    String productoNombre;

    @OneToMany(mappedBy = "producto")
    private List<PAC> pacs = new ArrayList<>();
}
