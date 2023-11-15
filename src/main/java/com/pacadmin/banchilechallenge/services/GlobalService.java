package com.pacadmin.banchilechallenge.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GlobalService {
    Page<?> obtenerDatosConFiltros(String rut, Integer dia, String nombreProducto, String nombreBanco, String clienteNombre, Long pacId, Double minMonto, Double maxMonto, Long cuentaId, Pageable pageable);
}
