/**
 * projectName: starter
 * fileName: Chapter1Application.java
 * packageName: com.sikiapp.starter.web
 * date: 2019-04-07 下午4:13
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @className: Chapter1Application
 * @packageName: com.sikiapp.starter.web
 * @description: Spring boot 入门1
 * @author: Robert
 * @data: 2019-04-07 下午4:13
 * @version: V1.0
 **/
@RestController
public class Chapter1Application {

    @GetMapping("/demo1")
    public String demo1() {
        return "Hello battcn";
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        // 目的是
        return args -> {
            System.out.println("来看看 SpringBoot 默认为我们提供的 Bean：");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            Arrays.stream(beanNames).forEach(System.out::println);
        };
    }
}
