/**
 * projectName: starter
 * fileName: PropertiesController.java
 * packageName: com.sikiapp.starter.web
 * date: 2019-04-07 下午5:02
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.web;

import com.sikiapp.starter.properties.MyProperties1;
import com.sikiapp.starter.properties.MyProperties2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @className: PropertiesController
 * @packageName: com.sikiapp.starter.web
 * @description: 自定义属性Controller
 * @author: Robert
 * @data: 2019-04-07 下午5:02
 * @version: V1.0
 **/
@RestController
@RequestMapping("/properties")
public class PropertiesController {

    private static final Logger log = LoggerFactory.getLogger(PropertiesController.class);

    private final MyProperties1 myProperties1;
    private final MyProperties2 myProperties2;

    @Autowired
    public PropertiesController(MyProperties1 myProperties1, MyProperties2 myProperties2) {
        this.myProperties1 = myProperties1; //spring 4.x后，推荐使用构造函数注入属性
        this.myProperties2 = myProperties2;
    }

    @GetMapping("/1")
    public MyProperties1 myProperties1() {
        return myProperties1;
    }

    @GetMapping("/2")
    public MyProperties2 myProperties2() {
        return myProperties2;
    }

    @PostMapping("/3")
    public String myProperties3(@RequestParam Integer uid) {
        System.out.println(uid);
        return "3";
    }

}