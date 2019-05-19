package com.wss.templateproject.service.impl;

import com.wss.templateproject.service.UmsMemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @创建人 songtx
 * @创建时间 2019-05-19 2:19
 * @描述
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UmsMemberServiceImplTest {

    @Autowired
    private UmsMemberService umsMemberService;
    @Test
    public void generateAuthCode() {
        String s = umsMemberService.generateAuthCode("17611000891");
        System.out.println(s);
    }

    @Test
    public void verifyAuthCode() {
    }
}