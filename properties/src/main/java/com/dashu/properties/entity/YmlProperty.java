package com.dashu.properties.entity;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <p>
 * yml主配置属性实体类
 * </p>
 *
 * @package: com.dashu.properties.entity
 * @description: 主配置属性
 * @author: dashu
 * @date: Created in 2020/11/19
 * @copyright: Copyright (c)
 * @version: V1.0
 * @modified: dashu
 */
@Data
@Component
public class YmlProperty {

    @Value("${user.name}")
    private String name;

    @Value("${user.website}")
    private String website;

    @Value("${user.email}")
    private String email;
}
