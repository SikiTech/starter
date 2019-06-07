/**
 * projectName: starter
 * fileName: Car.java
 * packageName: com.sikiapp.starter.reflection
 * date: 2019-04-18 下午10:50
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.reflection;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @className: Car
 * @packageName: com.sikiapp.starter.reflection
 * @description: 汽车
 * @author: Robert
 * @data: 2019-04-18 下午10:50
 * @version: V1.0
 **/
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Car {

    private String band;

    private Color color;

    public enum Color {
        RED,
        WHITE,
        BLACK,
        BLUE,
        YELLOR
    }
}