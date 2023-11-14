package com.pacadmin.banchilechallenge.services.PACService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacadmin.banchilechallenge.model.PAC;
import com.pacadmin.banchilechallenge.repository.PACRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PACServiceImpl implements PACService{
    
    @Autowired
    PACRepository pacRepository;

    @Override
    public PAC getPACPorId(Long id) {
        if (pacRepository.existsById(id)) {
            return pacRepository.findById(id).get();
        }
        return null;
    }

    
}
