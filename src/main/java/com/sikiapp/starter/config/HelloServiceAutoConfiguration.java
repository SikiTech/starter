/**
 * projectName: starter
 * fileName: HelloServiceAutoConfiguration.java
 * packageName: com.sikiapp.starter.config
 * date: 2019-04-27 下午5:02
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className: HelloServiceAutoConfiguration
 * @packageName: com.sikiapp.starter.config
 * @description: 自动配置类
 * @author: Robert
 * @data: 2019-04-27 下午5:02
 * @version: V1.0
 **/
@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class)
@ConditionalOnClass(HelloService.class)
public class HelloServiceAutoConfiguration {

    @Autowired
    private HelloServiceProperties helloServiceProperties;

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService() {
        return new HelloService(helloServiceProperties.getMsg());
    }
}