package com.pacadmin.banchilechallenge.repository;

import com.pacadmin.banchilechallenge.model.Cliente;
import com.pacadmin.banchilechallenge.model.PAC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByClienteRutAndClienteNombre(String clienteRut, String clienteNombre);
    List<Cliente> findByClienteRut(String clienteRut);
    List<Cliente> findByClienteNombre(String clienteNombre);
    List<PAC> findByPacIdAndPacFecha(Long pacId, Date pacFecha);
    List<PAC> findByPacIdAndPacFechaAndPacMonto(Long pacId, Date pacFecha, Double pacMonto);
    List<PAC> findByPacFechaAndPacMonto(Date pacFecha, Double pacMonto);
    List<PAC> findByPacFecha(Date pacFecha);
    List<PAC> findByPacMonto(Double pacMonto);
    List<PAC> findByPacIdAndPacMonto(Long pacId, Double pacMonto);
}
