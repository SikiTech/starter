/**
 * projectName: starter
 * fileName: DemoService.java
 * packageName: com.sikiapp.starter.el
 * date: 2019-04-18 上午10:31
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.el;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @className: DemoService
 * @packageName: com.sikiapp.starter.el
 * @description: 随便一个Bean
 * @author: Robert
 * @data: 2019-04-18 上午10:31
 * @version: V1.0
 **/
@Service
public class DemoService {

    @Value("其他类的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}