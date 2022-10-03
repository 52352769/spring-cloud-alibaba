package net.mddn.order.openfeign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration   全局配置  会将配置作用在所有的服务提供方
 *                  局部配置  只想针对某一个服务配置不加@Configuration
 */
//@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLever(){
        return Logger.Level.FULL;
    }
}
