package net.mddn.order.openfeign.feign;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-nacos-server",path = "/product/nacos")
public interface ProductFeignService {

    /**
     * PathVariable 需要指定（value） 否则启动报错
     * java.lang.IllegalStateException: PathVariable annotation was empty on param 0.
     * @param id
     * @return
     */
//    @GetMapping("/{id}")
//    public String get(@PathVariable("id") Integer id);

    @RequestLine("GET /{id}")   //指定get请求或者是post请求
    public String get(@Param("id") Integer id);


}
