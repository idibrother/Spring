package com.dongba.foo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by dongba on 2017-07-10.
 */
@SpringBootApplication
public class FooApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FooApplication.class);
    }

    public static void main (String[] args) {
        SpringApplication.run(FooApplication.class, args);
    }
}
