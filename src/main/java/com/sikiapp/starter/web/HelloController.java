/**
 * projectName: boot
 * fileName: HelloController.java
 * packageName: com.sikiapp.boot.web
 * date: 2019-04-06 上午10:06
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: HelloController
 * @packageName: com.sikiapp.boot.web
 * @description:
 * @author: Robert
 * @data: 2019-04-06 上午10:06
 * @version: V1.0
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello Springboot World";
    }



}