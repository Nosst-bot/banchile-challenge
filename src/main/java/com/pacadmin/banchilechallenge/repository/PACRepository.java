package com.pacadmin.banchilechallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pacadmin.banchilechallenge.model.PAC;

@Repository
public interface PACRepository extends JpaRepository<PAC,Long>{
    
}
