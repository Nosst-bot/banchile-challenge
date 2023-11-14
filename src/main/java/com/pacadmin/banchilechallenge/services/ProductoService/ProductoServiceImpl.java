package com.pacadmin.banchilechallenge.services.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacadmin.banchilechallenge.model.Producto;
import com.pacadmin.banchilechallenge.repository.ProductoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoService;

    @Override
    public Producto getProductoPorId(Long id) {
        if (productoService.existsById(id)) {
            return productoService.findById(id).get();
        }
        return null;
    }
    
}
