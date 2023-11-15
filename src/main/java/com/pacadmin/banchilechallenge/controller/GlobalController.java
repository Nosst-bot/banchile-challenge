package com.pacadmin.banchilechallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pacadmin.banchilechallenge.services.GlobalService;

@RestController
public class GlobalController {
    
    @Autowired
    GlobalService globalService;
}
