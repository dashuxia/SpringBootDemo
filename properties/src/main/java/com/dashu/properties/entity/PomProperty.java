package com.dashu.properties.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p>
 * pom.xml依赖属性实体类
 * </p>
 *
 * @package: com.dashu.properties.entity
 * @description: 依赖属性
 * @author: dashu
 * @date: Created in 2020/11/19
 * @copyright: Copyright (c)
 * @version: V1.0
 * @modified: dashu
 */
@Data
@Component
@ConfigurationProperties(prefix = "pom")
public class PomProperty {

    private String name;

    private String version;

    private String packaging;


}
