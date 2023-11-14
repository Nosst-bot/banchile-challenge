package com.pacadmin.banchilechallenge.controller;

import com.pacadmin.banchilechallenge.model.Cliente;
import com.pacadmin.banchilechallenge.services.ClienteService.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    ClienteServiceImpl clienteService;
    @GetMapping("/clientes")
    public List<Cliente> listarClientes() {
        return clienteService.findAll();
    }
}
