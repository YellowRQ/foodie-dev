package com.yellowrq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * ClassName:HelloController
 * Package:com.yellowrq.controller
 * Description:
 *
 * @author:huangruiqi
 * @date: 2020/1/13 14:54
 */
@RestController
public class HelloController {

    static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public Object hello() {
        logger.debug("debug: hello");
        logger.info("info: hello");
        logger.warn("warn: hello");
        logger.error("error: hello");
        return "Hello World";
    }
}