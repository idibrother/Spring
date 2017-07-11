package com.dongba.foo.controller;

import com.dongba.foo.model.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by dongba on 2017-07-10.
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s";

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        long id = counter.incrementAndGet();
        logger.info("id : {}", id);
        return new Greeting(id, String.format(template, name));
    }
}
