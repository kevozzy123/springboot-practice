package com.pan.myfriendsapp.core.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class SnowflakeIdGenerator implements IdentifierGenerator {

    private final Snowflake snowflake = IdUtil.getSnowflake();

    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        return snowflake.nextId();
    }
}
