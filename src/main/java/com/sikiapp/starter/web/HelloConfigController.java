/**
 * projectName: starter
 * fileName: HelloConfigController.java
 * packageName: com.sikiapp.starter.web
 * date: 2019-04-27 下午5:32
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.web;

import com.sikiapp.starter.config.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: HelloConfigController
 * @packageName: com.sikiapp.starter.web
 * @description: Hello配置类控制器
 * @author: Robert
 * @data: 2019-04-27 下午5:32
 * @version: V1.0
 **/
@RestController
@RequestMapping("/config")
public class HelloConfigController {

    @Autowired
    HelloService helloService;

    @GetMapping("/auto")
    public String index(){
        return helloService.sayHello();
    }
}