package com.dashu.helloworld.controller;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 控制类
 * </p>
 *
 * @package: com.dashu.helloworld.controller
 * @description: 访问控制类
 * @author: dashu
 * @date: Created in 2020/11/19
 * @copyright: Copyright (c)
 * @version: V1.0
 * @modified: dashu
 */
@RestController
@Slf4j
public class HelloworldController {

    /**
     *
     * Hello ${str}
     *
     * @param str:字符串参数
     * @return java.lang.String
     */
    @GetMapping("/hello")
    public String helloWorld(@RequestParam(required = false, name = "str") String str){

        //判断str是否为空
        if(StrUtil.isBlank(str)){
            str = "world";
        }
        //字符替换
        str = StrUtil.format("Hello, {}!", str);
        //日志输出
        log.info("接口("+Thread.currentThread().getStackTrace()[1].getMethodName()+")--->返回值："+str);
        return str;
    }
}
