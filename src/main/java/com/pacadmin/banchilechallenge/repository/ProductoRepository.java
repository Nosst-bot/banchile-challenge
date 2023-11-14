package com.pacadmin.banchilechallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pacadmin.banchilechallenge.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long>{
}
