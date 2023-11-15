package com.pacadmin.banchilechallenge.repository;

import com.pacadmin.banchilechallenge.dto.ClienteCuentaPacDTO;
import com.pacadmin.banchilechallenge.model.PAC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DTORepository extends JpaRepository<PAC, Long> {

    @Query("""
            SELECT c.cuentaId, c.cuentaNombreBanco, c.cliente.clienteId, cli.clienteNombre, cli.clienteRut, pac.pac_id, pac.monto, p.nombre FROM Cuenta c
                INNER JOIN Cliente cli ON c.cliente.clienteId=cli.clienteId
                INNER JOIN PAC pac ON pac.cliente_id=c.cuenta_id INNER JOIN productos p ON p.producto_id=pac.producto_id
            ORDER BY cliente_id;""")
    List<ClienteCuentaPacDTO> obtenerDatosCompletos();
}
