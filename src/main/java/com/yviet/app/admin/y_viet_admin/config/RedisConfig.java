package com.yviet.app.admin.y_viet_admin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

    @Value("6380")
    private int port;

    @Value("localhost")
    private String host;


    // =================================================
    //          TẠO KẾT NỐI ĐẾN REDIS
    // =================================================
    @Bean
    public LettuceConnectionFactory lettuceConnectionFactory() {
        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration();
        config.setHostName(host);
        config.setPort(port);

        return new LettuceConnectionFactory(config);
    }


    // Đoạn code này dùng để biến dữ liệu thành kiểu string CHUẨN HẾT để có thể chia sẽ dữ liệu cho các ứng dụng khác ngoài java
    // =================================================
    //        TẠO TEMPLATE MỚI ĐỂ LƯU TRỮ DỮ LIỆU
    // =================================================
    @Bean
    @Primary
    public RedisTemplate<String, String> redisTemplate(LettuceConnectionFactory lettuceConnectionFactory) {
        RedisTemplate<String, String> template = new RedisTemplate<>();
        template.setConnectionFactory(lettuceConnectionFactory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setHashValueSerializer(new StringRedisSerializer());
        template.setValueSerializer(new StringRedisSerializer());

        return template;
    }
}
