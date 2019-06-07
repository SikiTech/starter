/**
 * projectName: starter
 * fileName: HttpEncodingAutoConfiguration.java
 * packageName: com.sikiapp.starter.config
 * date: 2019-04-27 下午8:24
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.filter.OrderedCharacterEncodingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @className: HttpEncodingAutoConfiguration
 * @packageName: com.sikiapp.starter.config
 * @description: http编码自动配置类
 * @author: Robert
 * @data: 2019-04-27 下午8:24
 * @version: V1.0
 **/
@Configuration
@EnableConfigurationProperties(HttpEncodingProperties.class)
@ConditionalOnClass(CharacterEncodingFilter.class)
@ConditionalOnProperty(prefix = "spring.http.encoding", value = "enabled", matchIfMissing = true)
public class HttpEncodingAutoConfiguration {

    @Autowired
    private HttpEncodingProperties httpEncodingProperties;

    @Bean
    @ConditionalOnMissingBean(CharacterEncodingFilter.class)
    public CharacterEncodingFilter characterEncodingFilter() {
        OrderedCharacterEncodingFilter encodingFilter = new OrderedCharacterEncodingFilter();
        encodingFilter.setEncoding(httpEncodingProperties.getCharset().name());
        encodingFilter.setForceEncoding(httpEncodingProperties.isForce());
        return encodingFilter;
    }




}