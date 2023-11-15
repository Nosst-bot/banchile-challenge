package com.pacadmin.banchilechallenge.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.pacadmin.banchilechallenge.model.PAC;

@Repository
public interface PACRepository extends JpaRepository<PAC,Long> {

    @Query("SELECT cl.clienteRut, cl.clienteNombre, c.cuentaNombreBanco, c.cuentaId, pac.pacMonto, p.productoNombre, pac.pacId, pac.pacFecha " +
            "FROM PAC pac " +
            "INNER JOIN pac.producto p " +
            "INNER JOIN pac.cuenta c " +
            "INNER JOIN c.cliente cl " +
            "WHERE (:rut IS NULL OR cl.clienteRut = :rut) " +
            "AND (:dia IS NULL OR FUNCTION('DAY', pac.pacFecha) = :dia) " +
            "AND (:nombreProducto IS NULL OR p.productoNombre = :nombreProducto) " +
            "AND (:nombreBanco IS NULL OR c.cuentaNombreBanco = :nombreBanco) " +
            "AND (:nombreCliente IS NULL OR cl.clienteNombre LIKE CONCAT('%', :nombreCliente, '%')) " +
            "AND (:pacId IS NULL OR pac.pacId = :pacId)")
    Page<Object[]> obtenerDatosConFiltros(String rut, Integer dia, String nombreProducto, String nombreBanco, String nombreCliente, Long pacId, Pageable pageable);

}
