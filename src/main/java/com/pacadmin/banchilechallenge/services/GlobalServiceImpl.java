package com.pacadmin.banchilechallenge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.pacadmin.banchilechallenge.repository.PACRepository;

@Service
public class GlobalServiceImpl implements GlobalService{

    @Autowired
    PACRepository pacRepository;

    @Override
    public Page<Object[]> obtenerDatosConFiltros(String rut, Integer dia, String nombreProducto, String nombreBanco, String nombreCliente, Long pacId, Double minMonto, Double maxMonto, Pageable pageable) {
        return pacRepository.obtenerDatosConFiltros(rut, dia, nombreProducto, nombreBanco, nombreCliente, pacId, minMonto, maxMonto, pageable);
    }
}
