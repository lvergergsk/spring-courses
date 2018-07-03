package dev.lvergergsk.spring.springcourses;

import dev.lvergergsk.spring.springcourses.aop.business.Business1;
import dev.lvergergsk.spring.springcourses.aop.business.Business2;
import dev.lvergergsk.spring.springcourses.entity.Person;
import dev.lvergergsk.spring.springcourses.jdbc.PersonJdbcDao;
import dev.lvergergsk.spring.springcourses.jpa.PersonJpaRepository;
import dev.lvergergsk.spring.springcourses.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

@SpringBootApplication
public class SpringCoursesApplication implements CommandLineRunner {
    private static Logger staticLOGGER = LoggerFactory.getLogger(SpringBootApplication.class.getName());

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Business1 business1;

    @Autowired
    Business2 business2;

    @Autowired
    PersonJdbcDao dao;

    @Autowired
    PersonJpaRepository jpaRepository;

    @Autowired
    PersonSpringDataRepository springDataRepository;

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SpringCoursesApplication.class, args);
        staticLOGGER.debug("LOADED BEANS:" + Arrays.toString(configurableApplicationContext.getBeanDefinitionNames()));
    }

    @Override
    public void run(String... args) throws Exception {

//        Spring JDBC
        LOGGER.info("SpringJDBC: All users -> {}", dao.findAll());
        LOGGER.info("SpringJDBC: User id 10001 -> {}", dao.findById(10001));
        LOGGER.info("SpringJDBC: Deleting 10002 -> {} rows affected.", dao.deleteById(10002));
        LOGGER.info("SpringJDBC: Inserting 10004 -> {} rows affected.", dao.insert(new Person(10004, "Tara", "Berlin", new Date())));
        LOGGER.info("SpringJDBC: Update 10003 -> {} rows affected.", dao.update(new Person(10003, "Pieter", "Utrecht", new Date())));

//        JPA:
        LOGGER.info("JPA: User id 10001 -> {}", jpaRepository.findById(10001));
        LOGGER.info("JPA: Inserting with auto assigned id -> {}", jpaRepository.merge(new Person("Ellis", "Los Angeles", new Date())));
        LOGGER.info("JPA: Update 10004 -> {}", jpaRepository.merge(new Person(10004, "Tara", "London", new Date())));
        jpaRepository.deleteById(10003);
        LOGGER.info("JPA: All users -> {}", jpaRepository.findAll());

//        Spring Data
        LOGGER.info("SpringData: User id 10001 -> {}", springDataRepository.findById(10001));
        LOGGER.info("SpringData: Inserting 10002 -> {}", springDataRepository.save(new Person(10002, "Tara", "Berlin", new Date())));
        LOGGER.info("SpringData: Update 10004 -> {}", springDataRepository.save(new Person(10004, "Tara", "California", new Date())));
        springDataRepository.deleteById(10001);
        LOGGER.info("SpringData: All users -> {}", springDataRepository.findAll());

//        Spring AOP
        LOGGER.info(business1.calculateSomething());
        LOGGER.info(business2.calculateSomething());

    }

    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US);
        return localeResolver;
    }

//    @Bean
//    public ResourceBundleMessageSource messageSource() {
//        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//        messageSource.setBasename("messages");
//        return messageSource;
//    }
}

//https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-Security-2.0#changing-the-username-and-password