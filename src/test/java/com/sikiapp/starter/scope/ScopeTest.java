package com.sikiapp.starter.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class ScopeTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSigletonService sigletonService = context.getBean(DemoSigletonService.class);
        DemoSigletonService sigletonService1 = context.getBean(DemoSigletonService.class);

        DemoPrototyeService prototyeService = context.getBean(DemoPrototyeService.class);
        DemoPrototyeService prototyeService1 = context.getBean(DemoPrototyeService.class);


        System.out.println(sigletonService.equals(sigletonService1));
        System.out.println(prototyeService.equals(prototyeService1));

        context.close();
    }
}