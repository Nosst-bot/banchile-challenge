package com.pacadmin.banchilechallenge.dto;

public record ClienteCuentaPacDTO(
        Long clienteId,
        String rut,
        String nombreCliente,
        String nombreBanco,
        Long cuentaId,
        Double monto,
        String nombreProducto,
        Long pacId
) {
}
