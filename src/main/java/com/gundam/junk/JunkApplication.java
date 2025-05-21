package com.gundam.junk;

import common.jpa.annotation.EnableJpaCommonModule;
import common.non_jpa.annotation.EnableCommonModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCommonModule
@EnableJpaCommonModule
public class JunkApplication {

    public static void main(String[] args) {
        SpringApplication.run(JunkApplication.class, args);
    }

}
