package net.mddn.order.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CustomRule extends AbstractLoadBalancerRule {

    //初始化配置
    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    //
    @Override
    public Server choose(Object o) {
        System.out.println("自定义负载均衡");
        //获得当前请求的服务的实例
        ILoadBalancer loadBalancer = this.getLoadBalancer();
        List<Server> reachableServers = loadBalancer.getReachableServers();
        //使用安全线程生成随机数--根据服务实例总数
        int ran = ThreadLocalRandom.current().nextInt(reachableServers.size());
        //获取随机生成的服务
        Server server = reachableServers.get(ran);
//        //判断服务是否存活
//        if (server.isAlive()){
//            //非存活
//            return null;
//        }
        return server;
    }
}
