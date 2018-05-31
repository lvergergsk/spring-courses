package dev.lvergergsk.spring.springcourses.boot;

import dev.lvergergsk.spring.springcourses.componentscan.ComponentScanPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan("dev.lvergergsk.spring.springcourses.componentscan")
public class ComponentScanApp {
    private static Logger LOGGER = LoggerFactory.getLogger(ScopeApp.class);

    public static void main(String[] args) {

//        ConfigurableApplicationContext ctx = SpringApplication.run(ScopeApp.class, args);
        ConfigurableApplicationContext ctx =new AnnotationConfigApplicationContext(ComponentScanApp.class);
        ComponentScanPersonDAO componentScanPersonDAO= ctx.getBean(ComponentScanPersonDAO.class);

        LOGGER.info("{}, {}", componentScanPersonDAO,componentScanPersonDAO.getJdbcConnection());

        ctx.close();
    }
}
