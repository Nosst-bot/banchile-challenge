package com.pacadmin.banchilechallenge.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacadmin.banchilechallenge.dto.Filtro;
import com.pacadmin.banchilechallenge.model.Cliente;
import com.pacadmin.banchilechallenge.model.Cuenta;
import com.pacadmin.banchilechallenge.model.PAC;
import com.pacadmin.banchilechallenge.model.Producto;
import com.pacadmin.banchilechallenge.repository.ClienteRepository;
import com.pacadmin.banchilechallenge.repository.CuentaRepository;
import com.pacadmin.banchilechallenge.repository.PACRepository;
import com.pacadmin.banchilechallenge.repository.ProductoRepository;
import com.pacadmin.banchilechallenge.dto.JoinGlobal;

@Service
public class GlobalServiceImpl implements GlobalService{

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    CuentaRepository cuentaRepository;

    @Autowired
    PACRepository pacRepository;

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<Object[]> obtenerDatosConFiltros(String rut, Integer dia, String nombreProducto, String nombreBanco, String nombreCliente, Long pacId) {
        return pacRepository.obtenerDatosConFiltros(rut, dia, nombreProducto, nombreBanco, nombreCliente, pacId);
    }
}
