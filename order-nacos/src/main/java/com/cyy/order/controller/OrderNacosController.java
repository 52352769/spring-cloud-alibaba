package com.cyy.order.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order/nacos")
public class OrderNacosController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public String add(){
        System.out.println("添加订单");
        String msg = restTemplate.getForObject("http://stock-server/stock/nacos/reduce",String.class);
        return "添加订单" + msg;
    }

}
