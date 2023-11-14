package com.pacadmin.banchilechallenge.specifications;

import java.util.Date;

import org.springframework.data.jpa.domain.Specification;

import com.pacadmin.banchilechallenge.model.PAC;

public class PACSpecification {

    public static Specification<PAC> tieneCodigoServicion(Long codigoServicio) {
        return (root, query, cb) -> codigoServicio == null ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("fechaPago"), codigoServicio);
    }

    public static Specification<PAC> tieneFechaPago(Date fechaPago) {
        return (root, query, cb) -> fechaPago == null ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("fechaPago"), fechaPago);
    }
}
