package dev.lvergergsk.spring.springcourses.boot.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Foo {
    Foo(Bar bar) {
    }
}

class Bar {
}

@Configuration
public class AppConfig {
    @Bean
    public Foo foo() {
        return new Foo(bar());
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }
}