package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther zzyy
 * @create 2020-02-21 11:42
 */
@Configuration
public class GateWayConfig {
    /*
    * 配置了一个id为path_route_atguigu的路由规则,
    * 当访问地址http://localhost:9527/guonei的时候，会自动转发到http://news.baidu.com/guonei
    * */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_atguigu",
                r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();

        return routes.build();
    }

}
