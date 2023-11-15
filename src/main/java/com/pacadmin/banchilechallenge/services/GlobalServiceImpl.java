package com.pacadmin.banchilechallenge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacadmin.banchilechallenge.repository.ClienteRepository;
import com.pacadmin.banchilechallenge.repository.CuentaRepository;
import com.pacadmin.banchilechallenge.repository.PACRepository;
import com.pacadmin.banchilechallenge.repository.ProductoRepository;

@Service
public class GlobalServiceImpl {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    CuentaRepository cuentaRepository;

    @Autowired
    PACRepository pacRepository;

    @Autowired
    ProductoRepository productoRepository;

    
}
