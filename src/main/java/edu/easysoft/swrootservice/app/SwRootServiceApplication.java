package edu.easysoft.swrootservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"edu.easysoft.swrootservice.controller",
        "edu.easysoft.swrootservice.service"})
@EnableFeignClients("edu.easysoft.swrootservice.feignclient")
public class SwRootServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwRootServiceApplication.class, args);
    }

}
