package net.mddn.stock.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author CYY
 */
@SpringBootApplication
public class StockNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockNacosApplication.class);
        System.out.println("StockNacos运行完成");
    }
}
