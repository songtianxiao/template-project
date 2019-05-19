package com.wss.templateproject.controller;

import com.wss.templateproject.common.beans.ResultBean;
import com.wss.templateproject.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Year;

/**
 * @创建人 songtx
 * @创建时间 2019-05-18 23:57
 * @描述 会员登录注册管理Controller
 */
@RestController
@Api(tags = "umsMemberController", description = "会话登录注册管理")
@RequestMapping("/sso/")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;

    @ApiOperation("获取验证码")
    @GetMapping(value = "getAuthCode")
    public ResultBean<String>  getAuthCode(@RequestParam String telephone) {
        return new ResultBean<String>(umsMemberService.generateAuthCode(telephone));
    }

    @ApiOperation("判断验证码是否正确")
    @GetMapping(value = "verifyAuthCode")
    public ResultBean<String>  verifyAuthCode(@RequestParam String telephone,
                                              @RequestParam String authCode) {
        return new ResultBean<String>(umsMemberService.verifyAuthCode(telephone,authCode));
    }

}
