/**
 * projectName: starter
 * fileName: HttpEncodingProperties.java
 * packageName: com.sikiapp.starter.config
 * date: 2019-04-27 下午5:51
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;

/**
 * @className: HttpEncodingProperties
 * @packageName: com.sikiapp.starter.config
 * @description: Http编码属性配置
 * @author: Robert
 * @data: 2019-04-27 下午5:51
 * @version: V1.0
 **/
@Component
@ConfigurationProperties(prefix = "spring.http.encoding")
@Data
public class HttpEncodingProperties {
    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    private Charset charset = DEFAULT_CHARSET;

    private boolean force = true;
}