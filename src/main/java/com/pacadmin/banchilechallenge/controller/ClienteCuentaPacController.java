package com.pacadmin.banchilechallenge.controller;

import com.pacadmin.banchilechallenge.dto.ClienteCuentaPacDTO;
import com.pacadmin.banchilechallenge.services.DtoService.DtoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteCuentaPacController {

    @Autowired
    public DtoServiceImpl dtoService;
    @GetMapping("/listar")
    public List<ClienteCuentaPacDTO> listarDto() {
        return dtoService.findAll();
    }
}
