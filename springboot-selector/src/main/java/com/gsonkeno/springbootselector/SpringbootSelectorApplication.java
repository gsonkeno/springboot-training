package com.gsonkeno.springbootselector;

import com.gsonkeno.springbootselector.annotation.EnableSpringStudy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSpringStudy
public class SpringbootSelectorApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SpringbootSelectorApplication.class, args);

        Thread.sleep(1000*60*60);
    }
}
