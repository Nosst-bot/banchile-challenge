package com.pacadmin.banchilechallenge.services.ClienteService;

import com.pacadmin.banchilechallenge.model.Cliente;
import com.pacadmin.banchilechallenge.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente getClienteById(Long id) {
        return null;
    }
}
