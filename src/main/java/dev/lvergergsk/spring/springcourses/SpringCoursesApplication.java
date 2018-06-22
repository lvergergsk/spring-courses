package dev.lvergergsk.spring.springcourses;

import dev.lvergergsk.spring.springcourses.aop.business.Business1;
import dev.lvergergsk.spring.springcourses.aop.business.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringCoursesApplication implements CommandLineRunner {
    private static Logger staticLOGGER = LoggerFactory.getLogger(SpringBootApplication.class.getName());

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Business1 business1;

    @Autowired
    Business2 business2;

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SpringCoursesApplication.class, args);
        staticLOGGER.debug("LOADED BEANS:" + Arrays.toString(configurableApplicationContext.getBeanDefinitionNames()));
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info(business1.calculateSomething());
        LOGGER.info(business2.calculateSomething());

    }
}
