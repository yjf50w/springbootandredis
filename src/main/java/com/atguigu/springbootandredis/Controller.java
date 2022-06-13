package com.atguigu.springbootandredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: Controller
 * @Author Junfang Yuan
 * @Date: 2022/6/12 22:03
 * @Version 1.0
 */
@RestController
@RequestMapping("/redis")
public class Controller {
    @Autowired
    private RedisTemplate redisTemplate;
    @GetMapping
    public String test(){
        redisTemplate.opsForValue().set("name", "lucy");
        String name = (String) redisTemplate.opsForValue().get("name");
        return name;
//        123456

    }
}
