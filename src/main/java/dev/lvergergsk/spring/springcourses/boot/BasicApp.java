package dev.lvergergsk.spring.springcourses.boot;

import dev.lvergergsk.spring.springcourses.boot.basic.BinarySearchImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class BasicApp {
    public static void main(String[] args) {

//        ConfigurableApplicationContext ctx = SpringApplication.run(BasicApp.class, args);
        try (ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(BasicApp.class)) {
            BinarySearchImpl binarySearch = ctx.getBean(BinarySearchImpl.class);
            BinarySearchImpl singletonOrPrototype = ctx.getBean(BinarySearchImpl.class);

            System.out.println(binarySearch);
            System.out.println(singletonOrPrototype);

            int result = binarySearch.binarySearch(new int[]{1, 5, 3, 2, 0}, 3);
            System.out.println(result);

        }

    }
}