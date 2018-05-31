package dev.lvergergsk.spring.springcourses.boot;

import dev.lvergergsk.spring.springcourses.boot.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertiesApp {
    private static Logger LOGGER = LoggerFactory.getLogger(PropertiesApp.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(PropertiesApp.class)) {
            SomeExternalService someExternalService = annotationConfigApplicationContext.getBean(SomeExternalService.class);
            LOGGER.info("{}, url: {}", someExternalService, someExternalService.returnServiceUrl());
        }
    }
}
