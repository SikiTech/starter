/**
 * projectName: starter
 * fileName: ElConfig.java
 * packageName: com.sikiapp.starter.el
 * date: 2019-04-18 上午10:36
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.el;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * @className: ElConfig
 * @packageName: com.sikiapp.starter.el
 * @description: 配置类
 * @author: Robert
 * @data: 2019-04-18 上午10:36
 * @version: V1.0
 **/
//@Configuration
//@ComponentScan("com.sikiapp.starter.el")
//@PropertySource("classpath:com/sikiapp/starter/el/test.properties")
public class ElConfig {

    @Value("siki app")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("classpath:com/sikiapp/starter/el/test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void printResources() {
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(randomNumber);
        System.out.println(fromAnother);
        System.out.println(testFile);
        System.out.println(testUrl);
        System.out.println(bookName);
        System.out.println(environment);

        String description = testFile.getDescription();
        System.out.println(description);

    }







}