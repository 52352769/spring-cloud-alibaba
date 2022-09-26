package net.mddn.order.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //配置类注解
public class RandomRuleConfig {

    //方法名一定要叫iRule,其他名称失效
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
