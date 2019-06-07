/**
 * projectName: starter
 * fileName: ConfigTest.java
 * packageName: com.sikiapp.starter.config
 * date: 2019-04-27 下午5:20
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @className: ConfigTest
 * @packageName: com.sikiapp.starter.config
 * @description: 配置类测试
 * @author: Robert
 * @data: 2019-04-27 下午5:20
 * @version: V1.0
 **/
public class ConfigTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloServiceAutoConfiguration.class);
        HelloService bean = context.getBean(HelloService.class);
        HelloService bean1 = context.getBean(HelloService.class);

        System.out.println(bean1 == bean);


    }


}