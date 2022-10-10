package net.mddn.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/nacos")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/{id}")
    public String get(@PathVariable Integer id) throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("查询商品"+id);
        return "查询商品"+id+":"+port;
    }
}
