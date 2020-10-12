package com.hdw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;;



/**
 * @author TuMinglong
 * @description Application
 * @date 2017年9月5日下午8:55:08
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class BaseWebApplication extends SpringBootServletInitializer {

    protected final static Logger logger = LoggerFactory.getLogger(BaseWebApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        logger.info("----BaseWebApplication 启动----");
        return application.sources(BaseWebApplication.class);

    }

    public static void main(String[] args) {
        SpringApplication.run(BaseWebApplication.class, args);
        logger.info("----BaseWebApplication 启动----");
    }

}
