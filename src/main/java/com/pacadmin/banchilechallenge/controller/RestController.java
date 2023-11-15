package com.pacadmin.banchilechallenge.controller;

import com.pacadmin.banchilechallenge.services.GlobalServiceImpl;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    public GlobalServiceImpl globalService;

    @GetMapping("/filtrar")
    public List<Object[]> filtrarDatos(@RequestParam(required = false) String rut,
                                       @RequestParam(required = false) Integer dia,
                                       @RequestParam(required = false) String nombreProducto,
                                       @RequestParam(required = false) String nombreBanco,
                                       @RequestParam(required = false) String nombreCliente,
                                       @RequestParam(required = false) Long pacId) {
        return globalService.obtenerDatosConFiltros(rut, dia, nombreProducto, nombreBanco, nombreCliente, pacId);
    }
}
