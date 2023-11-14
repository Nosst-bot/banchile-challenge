package com.pacadmin.banchilechallenge.specifications;

import org.springframework.data.jpa.domain.Specification;

import com.pacadmin.banchilechallenge.model.Cuenta;

public class CuentaSpecification {
    public static Specification<Cuenta> tieneBanco(String banco) {
        return (root, query, cb) -> banco == null ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("nombreBanco"), banco);
    }

    public static Specification<Cuenta> tieneNumeroCuenta(Long idCuenta) {
        return (root, query, cb) -> idCuenta == null ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("idCuenta"), idCuenta);
    }
}
