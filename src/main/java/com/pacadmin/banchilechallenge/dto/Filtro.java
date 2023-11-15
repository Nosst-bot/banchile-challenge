package com.pacadmin.banchilechallenge.dto;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Filtro {

    private String clienteRut;
    private String clienteNombre;
    private String cuentaNombreBanco;
    private Long cuentaId;
    private String productoNombre;
    private Long pacId;
    private Date pacFecha;
//    private Double pacMonto;
}
