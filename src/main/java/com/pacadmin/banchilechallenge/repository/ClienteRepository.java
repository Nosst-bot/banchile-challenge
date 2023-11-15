package com.pacadmin.banchilechallenge.repository;

import com.pacadmin.banchilechallenge.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByClienteRut(String clienteRut);
    List<Cliente> findByClienteNombre(String clienteNombre);
}
