/**
 * projectName: starter
 * fileName: DemoPrototyeService.java
 * packageName: com.sikiapp.starter.scope
 * date: 2019-04-17 下午10:24
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @className: DemoPrototyeService
 * @packageName: com.sikiapp.starter.scope
 * @description: 多例
 * @author: Robert
 * @data: 2019-04-17 下午10:24
 * @version: V1.0
 **/
@Service
@Scope("prototype")
public class DemoPrototyeService {
}