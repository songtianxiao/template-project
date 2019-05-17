package com.wss.templateproject.config;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @创建人 songtx
 * @创建时间 2019-05-15 21:09
 * @描述 通用mapper配置类
 */
@Configuration
@MapperScan(value = "com.wss.templateproject.mapper")
public class MybatisConfig {
}
