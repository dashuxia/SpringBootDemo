package com.dashu.helloworld;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * <p>
 * SpringBoot启动类
 * </p>
 *
 * @package: com.dashu.helloworld
 * @description: SpringBoot启动类
 * @author: dashu
 * @date: Created in 2020/11/19
 * @copyright: Copyright (c)
 * @version: V1.0
 * @modified: dashu
 */
@SpringBootApplication
@Slf4j
public class HelloworldApplication {

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext application = SpringApplication.run(HelloworldApplication.class, args);
        Environment env = application.getEnvironment();
        //获取本机ip
        String ip = InetAddress.getLocalHost().getHostAddress();
        //获取配置文件端口
        String port = env.getProperty("server.port");
        //获取配置文件项目启动路径
        String path = env.getProperty("server.servlet.context-path");
        //日志输出访问路径
        log.info("\n----------------------------------------------------------\n\t" +
                "Application helloword is running! Access URLs:\n\t" +
                "URL: \t\thttp://"+ip+":" + port + path + "\n\t" +
                "----------------------------------------------------------");
    }

}
