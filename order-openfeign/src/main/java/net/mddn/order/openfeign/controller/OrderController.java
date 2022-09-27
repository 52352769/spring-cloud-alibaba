package net.mddn.order.openfeign.controller;

import net.mddn.order.openfeign.feign.StockNacosFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order/openfeign")
public class OrderController {

    @Autowired
    private StockNacosFeignService stockService;


    @GetMapping("/add")
    public String add(){
        System.out.println("添加订单");
        String reduce = stockService.reduce();
        return "添加订单" + reduce;
    }
}
