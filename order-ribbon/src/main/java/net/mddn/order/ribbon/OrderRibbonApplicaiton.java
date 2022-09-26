package net.mddn.order.ribbon;

import net.mddn.order.config.RandomRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//指定ribbon负载均衡策略--自定义配置类方式
//@RibbonClients(value = {
//    @RibbonClient(name = "stock-nacos-server",configuration = RandomRuleConfig.class)
//})
public class OrderRibbonApplicaiton {

    public static void main(String[] args) {
        SpringApplication.run(OrderRibbonApplicaiton.class);
        System.out.println("OrderRibbon启动完成");
    }

    @Bean
    @LoadBalanced   //负载均衡器 -- 不加此调用其他服务无法调用
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        RestTemplate restTemplate = builder.build();
        return restTemplate;
    }
}
