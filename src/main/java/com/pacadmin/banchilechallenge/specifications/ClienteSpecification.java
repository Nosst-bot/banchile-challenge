package com.pacadmin.banchilechallenge.specifications;

import org.springframework.data.jpa.domain.Specification;

import com.pacadmin.banchilechallenge.model.Cliente;

public class ClienteSpecification {
    public static Specification<Cliente> tieneRut(String rut) {
        return (root, query, cb) -> rut == null ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("rut"), rut);
    }
    
    public static Specification<Cliente> tieneNombre(String nombre) {
        return (root, query, cb) -> nombre == null ? cb.isTrue(cb.literal(true)) : cb.like(root.get("nombre"), "%" + nombre + "%");
    }
}
