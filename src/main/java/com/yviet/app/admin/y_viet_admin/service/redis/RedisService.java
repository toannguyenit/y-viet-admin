package com.yviet.app.admin.y_viet_admin.service.redis;

import org.apache.poi.ss.formula.functions.T;

public interface RedisService<T> {

    // Save data to Redis
    void saveData(T key, Object value);

    // Get data from Redis
    Object getData(T key);

    // Delete data from Redis
    void deleteData(T key);
}
