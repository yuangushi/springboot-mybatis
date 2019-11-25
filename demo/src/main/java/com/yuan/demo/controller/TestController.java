package com.yuan.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @RequestMapping("/setnx")
    @ResponseBody
    public String setNx(String key,String value){
        redisTemplate.opsForValue().set(key,value);
        return redisTemplate.opsForValue().get(key);
//        return value;
    }
}
