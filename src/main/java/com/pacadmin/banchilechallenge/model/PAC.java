package com.pacadmin.banchilechallenge.model;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pacs")
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
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    @Column(name = "fecha")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pacFecha;

    @Column(name = "monto")
    private Double pacMonto;
}
