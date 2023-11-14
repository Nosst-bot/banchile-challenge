package com.pacadmin.banchilechallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pacadmin.banchilechallenge.model.Producto;
import com.pacadmin.banchilechallenge.services.ProductoService.ProductoService;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ProductoController {
    
    @Autowired
    ProductoService productoService;

    @GetMapping("/get/{id}")
    public Producto getProductoPorId(@PathVariable Long id) {
        return productoService.getProductoPorId(id);
    }
}
