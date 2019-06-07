/**
 * projectName: starter
 * fileName: ELTest.java
 * packageName: com.sikiapp.starter.el
 * date: 2019-04-18 上午11:12
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @className: ELTest
 * @packageName: com.sikiapp.starter.el
 * @description: Spring EL 测试
 * @author: Robert
 * @data: 2019-04-18 上午11:12
 * @version: V1.0
 **/
public class ELTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.printResources();

        context.close();
    }



}