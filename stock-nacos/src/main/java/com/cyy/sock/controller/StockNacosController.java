package com.cyy.sock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock/nacos")
public class StockNacosController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/reduce")
    public String reduce(){
        System.out.println("减库存");
        return "减库存"+port;
    }
}
