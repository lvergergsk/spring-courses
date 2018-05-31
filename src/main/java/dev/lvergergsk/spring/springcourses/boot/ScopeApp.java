package dev.lvergergsk.spring.springcourses.boot;

import dev.lvergergsk.spring.springcourses.boot.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class ScopeApp {

    private static Logger LOGGER = LoggerFactory.getLogger(ScopeApp.class);

    public static void main(String[] args) {

//        ConfigurableApplicationContext ctx = SpringApplication.run(ScopeApp.class, args);
        ConfigurableApplicationContext ctx =new AnnotationConfigApplicationContext(ScopeApp.class);
        PersonDAO personDAO1 = ctx.getBean(PersonDAO.class);
        PersonDAO personDAO2 = ctx.getBean(PersonDAO.class);

        LOGGER.info("{}, {}", personDAO1, personDAO1.getJdbcConnection());
        LOGGER.info("{}, {}", personDAO2, personDAO2.getJdbcConnection());

        ctx.close();
    }
}
