package com.pacadmin.banchilechallenge.repository;

import com.pacadmin.banchilechallenge.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
    
}
