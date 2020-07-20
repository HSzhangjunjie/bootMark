package com.example.hiboot.config;

import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;

/**
 * @ProjectName: hiboot
 * @Package: com.example.hiboot.config
 * @ClassName: MyRedisConfig
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/7/16 0:04
 * @Version: 1.0
 */
@Configuration
public class MyRedisConfig {
    @Bean
    public CacheManager cacheManager(RedisConnectionFactory factory) {
        RedisCacheConfiguration cacheConfiguration =
                RedisCacheConfiguration.defaultCacheConfig()
                        // 增加一个前缀
                        .entryTtl(Duration.ofDays(1))
                        // 禁用缓存空值。
                        .disableCachingNullValues()
                        .serializeValuesWith(
                                RedisSerializationContext.SerializationPair.fromSerializer(
                                        new GenericJackson2JsonRedisSerializer()))
                        .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(
                                new StringRedisSerializer()));
        return RedisCacheManager.builder(factory).cacheDefaults(cacheConfiguration).build();
    }
}