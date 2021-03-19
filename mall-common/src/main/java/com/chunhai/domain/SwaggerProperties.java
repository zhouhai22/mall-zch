package com.chunhai.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class SwaggerProperties {
    /**
     * API生成文档基础路径
     */
    private String apiBasePackage;

    private boolean enableSecurity;

    private String title;

    private String description;

    private String version;

    private String contactName;

    private String contactUrl;

    private String contactEmail;
}
