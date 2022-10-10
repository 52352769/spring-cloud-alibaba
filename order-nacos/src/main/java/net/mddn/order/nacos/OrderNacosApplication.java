package net.mddn.order.nacos;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author CYY
 */
@SpringBootApplication
public class OrderNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderNacosApplication.class);
        System.out.println("OrderNacos启动完成");
    }
    @Bean
    @LoadBalanced   //负载均衡器 -- 不加此调用其他服务无法调用
    public RestTemplate restTemplate(RestTemplateBuilder builder){
//        builder.setReadTimeout() 读取时间
//        builder.setConnectTimeout() 连接时间
        RestTemplate restTemplate = builder.build();
        return restTemplate;
    }
}
