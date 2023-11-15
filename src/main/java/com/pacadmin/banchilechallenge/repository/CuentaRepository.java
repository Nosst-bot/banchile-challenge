package com.pacadmin.banchilechallenge.repository;

import com.pacadmin.banchilechallenge.model.Cuenta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Long> {

    List<Cuenta> findByCuentaNombreBanco(String cuentaNombreBanco);
    List<Cuenta> findByCuentaIdAndCuentaNombreBanco(Long cuentaId, String cuentaNombreBanco);
}
