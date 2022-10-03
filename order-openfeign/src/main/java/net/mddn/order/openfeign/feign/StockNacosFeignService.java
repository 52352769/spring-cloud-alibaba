package net.mddn.order.openfeign.feign;

import net.mddn.order.openfeign.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// name 指定服务提供方服务名  path 指定controller的请求路径
@FeignClient(name = "stock-nacos-server",path = "/stock/nacos",configuration = FeignConfig.class)
public interface StockNacosFeignService {

    /**
     * 声明需要调用的方法
     * @return
     */
    @GetMapping("/reduce")
    String reduce();
}
