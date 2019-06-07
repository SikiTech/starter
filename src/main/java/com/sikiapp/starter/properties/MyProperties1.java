/**
 * projectName: starter
 * fileName: MyProperties1.java
 * packageName: com.sikiapp.starter.properties
 * date: 2019-04-07 下午4:59
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @className: MyProperties1
 * @packageName: com.sikiapp.starter.properties
 * @description: 自定义属性配置
 * @author: Robert
 * @data: 2019-04-07 下午4:59
 * @version: V1.0
 **/
@Component
@ConfigurationProperties(prefix = "my1")
@Getter
@Setter
@ToString
public class MyProperties1 {

    private int age;
    private String name;
}