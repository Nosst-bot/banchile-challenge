package com.pacadmin.banchilechallenge.services.ClienteService;


import com.pacadmin.banchilechallenge.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {

    List<Cliente> findAll();

    Cliente getClienteById(Long id);
}
