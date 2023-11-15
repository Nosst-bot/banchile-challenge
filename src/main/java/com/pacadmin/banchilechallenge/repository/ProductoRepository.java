package com.pacadmin.banchilechallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pacadmin.banchilechallenge.model.Producto;
import java.util.List;


@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {

    List<Producto> findByProductoNombre(String productoNombre);
}
