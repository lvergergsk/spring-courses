package dev.lvergergsk.spring.springcourses.boot.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
// No effect without proxy.
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {
    public JdbcConnection() {
        System.out.println("JDBC connection");
    }
}
