package com.wss.templateproject.service;

/**
 * @创建人 songtx
 * @创建时间 2019-05-18 23:59
 * @描述 会员登录注册管理Service
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     */
    String generateAuthCode(String telephone);
    /**
     * 判断验证码和手机号码是否匹配
     */
    String verifyAuthCode(String telephone,String authCode);
}
