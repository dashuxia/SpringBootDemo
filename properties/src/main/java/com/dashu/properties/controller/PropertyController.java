package com.dashu.properties.controller;

import cn.hutool.core.lang.Dict;
import com.dashu.properties.entity.PomProperty;
import com.dashu.properties.entity.YmlProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 访问控制类
 * </p>
 *
 * @package: com.dashu.properties.controller
 * @description: 访问控制类
 * @author: dashu
 * @date: Created in 2020/11/19
 * @copyright: Copyright (c)
 * @version: V1.0
 * @modified: dashu
 */
@RestController
@Slf4j
public class PropertyController {

    private final PomProperty pomProperty;

    private final YmlProperty ymlProperty;

    /**
     * 构造方法注入组件
     * @param pomProperty
     * @param ymlProperty
     */
    @Autowired
    public PropertyController(PomProperty pomProperty, YmlProperty ymlProperty) {
        this.pomProperty = pomProperty;
        this.ymlProperty = ymlProperty;
    }

    @GetMapping("getProperty")
    public Dict property(){
        log.info("pom:"+ pomProperty);
        log.info("yml:"+ ymlProperty);
        return Dict.create().set("pom", pomProperty).set("yml", ymlProperty);
    }

}
