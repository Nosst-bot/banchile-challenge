package com.pacadmin.banchilechallenge.util;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

public class CustomRandomIdGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {
        long min = 100_000_000L;
        long max = 999_999_999L;
        return ThreadLocalRandom.current().nextLong(min, max + 1);
    }
}
