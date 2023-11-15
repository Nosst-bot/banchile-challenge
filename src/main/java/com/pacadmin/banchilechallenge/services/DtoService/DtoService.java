package com.pacadmin.banchilechallenge.services.DtoService;

import com.pacadmin.banchilechallenge.dto.ClienteCuentaPacDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DtoService {

    List<ClienteCuentaPacDTO> findAll();
}
