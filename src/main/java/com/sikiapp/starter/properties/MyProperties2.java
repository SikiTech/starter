/**
 * projectName: starter
 * fileName: MyProperties1.java
 * packageName: com.sikiapp.starter.properties
 * date: 2019-04-07 下午4:59
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @className: MyProperties1
 * @packageName: com.sikiapp.starter.properties
 * @description: 自定义属性配置（从其他.properties文件中读取）
 * @author: Robert
 * @data: 2019-04-07 下午4:59
 * @version: V1.0
 **/
@Component
@PropertySource("classpath:my2.properties")
@ConfigurationProperties(prefix = "my2")
@Data
public class MyProperties2 {

    private int age;
    private String name;
    private String email;
}