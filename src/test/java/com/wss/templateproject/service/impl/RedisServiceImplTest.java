package com.wss.templateproject.service.impl;

import com.wss.templateproject.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @创建人 songtx
 * @创建时间 2019-05-18 22:16
 * @描述
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisServiceImplTest {

    @Autowired
    private RedisService redisService;
    @Test
    public void set() {
        redisService.set("songtx","wsss");
    }

    @Test
    public void get() {
        redisService.get("songtx");
    }

    @Test
    public void exprice() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void increment() {
    }
}