package com.pacadmin.banchilechallenge.services.ClienteService;


import com.pacadmin.banchilechallenge.model.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> findAll();

    Cliente getClienteById(Long id);
}
