package com.pacadmin.banchilechallenge.repository;

import com.pacadmin.banchilechallenge.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
