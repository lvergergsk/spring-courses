package dev.lvergergsk.spring.springcourses.boot;

import dev.lvergergsk.spring.springcourses.boot.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class CdiApp {
    private static Logger LOGGER = LoggerFactory.getLogger(CdiApp.class);

    public static void main(String[] args) {
//        ConfigurableApplicationContext ctx = SpringApplication.run(CdiApp.class, args);
        try (ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(CdiApp.class)) {
            SomeCDIBusiness someCDIBusiness = ctx.getBean(SomeCDIBusiness.class);
            LOGGER.info("{}, dao-{}", someCDIBusiness, someCDIBusiness.getSomeCdiDao());
        }
    }
}
