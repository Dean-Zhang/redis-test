package com.dean.redistest.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class RedisClusterConfig extends CachingConfigurerSupport {
    public RedisTemplate redisTemplate() {
        StringRedisTemplate template = new StringRedisTemplate();
        Map<String, Object> source = new HashMap<>();
        RedisClusterConfiguration config = new RedisClusterConfiguration(source);
        JedisConnectionFactory factor = new JedisConnectionFactory(config);
        template.setConnectionFactory(factor);
    }
}
