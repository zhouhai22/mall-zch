package com.chunhai.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.chunhai.mall.mapper","com.chunhai.mall.dao"})
public class MybatisConfig {
}
