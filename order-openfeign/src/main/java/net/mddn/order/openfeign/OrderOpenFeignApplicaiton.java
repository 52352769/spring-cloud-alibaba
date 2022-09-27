package net.mddn.order.openfeign;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients     //feign注解
public class OrderOpenFeignApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignApplicaiton.class);
        System.out.println("OrderOpenFeign启动完成");
    }
}
