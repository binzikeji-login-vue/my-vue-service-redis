package com.binzikeji.my.vue.service.redis.service;

/**
 * @Description
 * @Author Bin
 * @Date 2019/4/27 14:48
 **/
public interface RedisService {

    void put(String key, Object value, long seconds);

    Object get(String key);
}
