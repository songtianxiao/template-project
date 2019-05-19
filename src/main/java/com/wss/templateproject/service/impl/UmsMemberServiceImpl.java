package com.wss.templateproject.service.impl;

import com.wss.templateproject.common.exceptions.CheckException;
import com.wss.templateproject.service.RedisService;
import com.wss.templateproject.service.UmsMemberService;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @创建人 songtx
 * @创建时间 2019-05-19 0:20
 * @描述
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {
     @Autowired
     private RedisService redisService;
     @Value("${redis.key.prefix.authCode}")
     private String REDIS_KEY_PREFIX_AUTH_CODE;
     @Value("${redis.key.expire.authCode}")
     private Long AUTH_CODE_EXPIRE_SECONDS;

    @Override
    public String generateAuthCode(String telephone) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i<6 ; i++) {
            sb.append(random.nextInt(10));
        }
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE+telephone, sb.toString());
        redisService.exprice(REDIS_KEY_PREFIX_AUTH_CODE+telephone, AUTH_CODE_EXPIRE_SECONDS);
        return sb.toString();
    }

    @Override
    public String verifyAuthCode(String telephone, String authCode) {
        if(StringUtils.isBlank(authCode)) {
            throw new CheckException("请输入验证码");
        }
        String realAuthCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE+telephone);
        if (authCode.equals(realAuthCode)) {
            return "验证码校验成功";
        } else {
            throw new CheckException("验证码不正确");
        }
    }
}
