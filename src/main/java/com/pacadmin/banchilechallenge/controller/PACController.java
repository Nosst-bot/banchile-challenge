package com.pacadmin.banchilechallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pacadmin.banchilechallenge.model.PAC;
import com.pacadmin.banchilechallenge.services.PACService.PACService;

@RestController
@RequestMapping("/pac")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PACController {
    
    @Autowired
    PACService pacService;

    @GetMapping("/get/{id}")
    public PAC getPACPorId(@PathVariable Long id) {
        return pacService.getPACPorId(id);
    }
}
