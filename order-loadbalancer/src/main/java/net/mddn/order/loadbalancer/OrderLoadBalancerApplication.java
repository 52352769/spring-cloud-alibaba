package net.mddn.order.loadbalancer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderLoadBalancerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderLoadBalancerApplication.class);
        System.out.println("OrderLoadBalancer启动完成");
    }

    @Bean
    @LoadBalanced   //负载均衡器 -- 不加此调用其他服务无法调用
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        RestTemplate restTemplate = builder.build();
        return restTemplate;
    }
}
