package com.yviet.app.admin.y_viet_admin.service.redis;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisImpl implements RedisService<String>{

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void saveData(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    @Override
    public Object getData(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public void deleteData(String key) {
        redisTemplate.delete(key);
    }

    @Override
    public boolean isDataExists(String key) {
        return redisTemplate.hasKey(key);
    }
}
