package com.pacadmin.banchilechallenge.services.DtoService;

import com.pacadmin.banchilechallenge.dto.ClienteCuentaPacDTO;
import com.pacadmin.banchilechallenge.repository.DTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DtoServiceImpl implements DtoService{

    @Autowired
    public DTORepository dtoRepository;

    @Override
    public List<ClienteCuentaPacDTO> findAll() {
        return dtoRepository.obtenerDatosCompletos();
    }
}
