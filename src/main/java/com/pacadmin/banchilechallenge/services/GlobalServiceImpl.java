package com.pacadmin.banchilechallenge.services;

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

    public List<JoinGlobal> buscarConFiltros(Filtro filtro) {

        List<Cliente> clientes;

        if (filtro.getClienteRut() != null && filtro.getClienteNombre() != null) {
            clientes = clienteRepository.findByClienteRutAndClienteNombre(filtro.getClienteRut(), filtro.getClienteNombre());
        } else if (filtro.getClienteRut() != null) {
            clientes = clienteRepository.findByClienteRut(filtro.getClienteRut());
        } else if (filtro.getClienteNombre() != null) {
            clientes = clienteRepository.findByClienteNombre(filtro.getClienteNombre());
        } else {
            clientes = clienteRepository.findAll();
        }

        List<Cuenta> cuentas;

        if (filtro.getCuentaId() != null && filtro.getCuentaNombreBanco() != null) {
            cuentas = cuentaRepository.findByCuentaIdAndCuentaNombreBanco(filtro.getCuentaId(), filtro.getCuentaNombreBanco());
        } else if (filtro.getCuentaId() != null) {
           /*  cuentas = cuentaRepository.findById(filtro.getCuentaId()).get(); */
        } else if (filtro.getCuentaNombreBanco() != null) {
            cuentas = cuentaRepository.findByCuentaNombreBanco(filtro.getCuentaNombreBanco());
        } else {
            cuentas = cuentaRepository.findAll();
        }

        List<PAC> pacs;

        if (filtro.getPacId() != null && filtro.getPacFecha() != null && filtro.getPacMonto() != null) {
            pacs = clienteRepository.findByPacIdAndPacFechaAndPacMonto(filtro.getPacId(), filtro.getPacFecha(), filtro.getPacMonto());
        } else if (filtro.getPacId() != null && filtro.getPacFecha() != null) {
            pacs = clienteRepository.findByPacIdAndPacFecha(filtro.getPacId(), filtro.getPacFecha());
        } else if (filtro.getPacId() != null && filtro.getPacMonto() != null) {
            pacs = clienteRepository.findByPacIdAndPacMonto(filtro.getPacId(), filtro.getPacMonto());
        } else if (filtro.getPacFecha() != null && filtro.getPacMonto() != null) {
            pacs = clienteRepository.findByPacFechaAndPacMonto(filtro.getPacFecha(), filtro.getPacMonto());
        } else if (filtro.getPacId() != null) {
            /* pacs = clienteRepository.findById(filtro.getPacId()); */
        } else if (filtro.getPacFecha() != null) {
            pacs = clienteRepository.findByPacFecha(filtro.getPacFecha());
        } else if (filtro.getPacMonto() != null) {
            pacs = clienteRepository.findByPacMonto(filtro.getPacMonto());
        } else {
            pacs = pacRepository.findAll();
        }

        List<Producto> productos;
        
        if (filtro.getCuentaId() != null && filtro.getCuentaNombreBanco() != null) {
            productos = productoRepository.findByProductoNombre(filtro.getProductoNombre());
        } else {
            productos = productoRepository.findAll();
        }

        // Realiza el JOIN de las tablas y devuelve los resultados
        /* return joinTablas(clientes, cuentas, pacs, productos); */
        return null;
    }

    private List<JoinGlobal> joinTablas(List<Cliente> clientes, List<Cuenta> cuentas, List<PAC> pacs, List<Producto> productos) {
        return null;
    }
}
