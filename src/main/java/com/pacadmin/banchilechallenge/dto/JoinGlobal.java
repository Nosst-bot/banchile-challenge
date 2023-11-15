package com.pacadmin.banchilechallenge.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JoinGlobal {
    
    private Long clienteId;
    private String clienteRut;
    private String clienteNombre;
    private Long cuentaId;
    private String cuentaNombreBanco;
    private Long pacId;
    private LocalDate pacFecha;
    private Double pacMonto;
    private Long productoId;
    private String productoNombre;
}
