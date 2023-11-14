package com.pacadmin.banchilechallenge.specifications;

import org.springframework.data.jpa.domain.Specification;

import com.pacadmin.banchilechallenge.model.Producto;

public class ProductoSpecification {
    public static Specification<Producto> tieneProducto(String nombreProducto) {
        return (root, query, cb) -> nombreProducto == null ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("nombreProducto"), nombreProducto);
    }
}
