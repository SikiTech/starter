/**
 * projectName: starter
 * fileName: HelloService.java
 * packageName: com.sikiapp.starter.config
 * date: 2019-04-27 下午5:04
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.config;

import lombok.*;

/**
 * @className: HelloService
 * @packageName: com.sikiapp.starter.config
 * @description: 需要生成的Bean
 * @author: Robert
 * @data: 2019-04-27 下午5:04
 * @version: V1.0
 **/
@Data
public class HelloService {
    private String msg;

    public HelloService(String msg) {
        this.msg = msg;
    }

    public String sayHello() {
        return "hello " + msg;
    }
}