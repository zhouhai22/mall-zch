package com.chunhai.mall.config;

import com.chunhai.config.BaseSwaggerConfig;
import com.chunhai.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.chunhai.mall.controller")
                .description("mall后台相关接口文档")
                .title("mall后台系统")
                .contactName("chunhai")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
