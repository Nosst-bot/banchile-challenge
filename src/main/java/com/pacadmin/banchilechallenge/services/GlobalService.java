package com.pacadmin.banchilechallenge.services;

import java.util.List;

public interface GlobalService {
    List<?> obtenerDatosConFiltros(String rut, Integer dia, String nombreProducto, String nombreBanco);
}
