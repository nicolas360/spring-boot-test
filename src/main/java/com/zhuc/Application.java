package com.zhuc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ZHUC on 2015/6/16.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        // 可以直接运行main方法
        // 也可以通过mvn spring-boot:run 命令运行，但是这种情况只允许存在一个main方法(弊端是若系统存在子线程任务，按CTRL+C无法停止)
        SpringApplication.run(Application.class, args);
    }
}
