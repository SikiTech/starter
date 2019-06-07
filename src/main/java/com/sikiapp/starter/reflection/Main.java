/**
 * projectName: starter
 * fileName: Main.java
 * packageName: com.sikiapp.starter.reflection
 * date: 2019-04-18 下午10:52
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.reflection;

/**
 * @className: Main
 * @packageName: com.sikiapp.starter.reflection
 * @description: 测试类
 * @author: Robert
 * @data: 2019-04-18 下午10:52
 * @version: V1.0
 **/
public class Main {


    public static void main(String[] args) {

        Car car = new Car();
        Class aClass = car.getClass();
        System.out.println(aClass);

        Class<Car> carClass = Car.class;
        System.out.println(carClass);

        try {
            Class forName = Class.forName("com.sikiapp.starter.reflection.Car");
            System.out.println(forName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}


