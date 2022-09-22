package com.cyy.sock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockNacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockNacosApplication.class);
        System.out.println("运行完成");
    }
}
