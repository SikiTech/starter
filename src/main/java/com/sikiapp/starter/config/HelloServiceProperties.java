/**
 * projectName: starter
 * fileName: HelloServiceProperties.java
 * packageName: com.sikiapp.starter.config
 * date: 2019-04-27 下午4:56
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @className: HelloServiceProperties
 * @packageName: com.sikiapp.starter.config
 * @description: 属性配置
 * @author: Robert
 * @data: 2019-04-27 下午4:56
 * @version: V1.0
 **/
@Configuration
@PropertySource("classpath:hello.properties")
@ConfigurationProperties(prefix = "hello")
@Data
public class HelloServiceProperties {
    private static final String DEFAULT_MSG = "world";

    private String msg = DEFAULT_MSG;
}