package com.pacadmin.banchilechallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pacadmin.banchilechallenge.model.PAC;
import java.util.List;
import java.util.Date;


@Repository
public interface PACRepository extends JpaRepository<PAC,Long> {

    List<PAC> findByPacFecha(Date pacFecha);
    List<PAC> findByPacMontoBetween(Double montoInicial, Double montoFinal);
}
