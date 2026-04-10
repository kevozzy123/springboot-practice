package com.pan.myfriendsapp.core.utils;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class SnowflakeIdGenerator implements IdentifierGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        return snowflake.nextId();
    }
}
