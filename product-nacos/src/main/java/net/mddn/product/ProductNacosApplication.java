package net.mddn.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductNacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductNacosApplication.class);
        System.out.println("ProductNacos启动完成");
    }
}
