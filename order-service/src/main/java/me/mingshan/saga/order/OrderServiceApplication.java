package me.mingshan.saga.order;

import org.apache.servicecomb.saga.omega.spring.EnableOmega;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author mingshan
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableOmega
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
