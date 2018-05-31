package dev.lvergergsk.spring.springcourses.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentScanPersonDAO {
    public void setJdbcConnection(ComponentScanJdbcConnection componentScanJdbcConnection) {
        this.componentScanJdbcConnection=componentScanJdbcConnection;
    }

    @Autowired
    ComponentScanJdbcConnection componentScanJdbcConnection;

    public ComponentScanJdbcConnection getJdbcConnection() {
        return this.componentScanJdbcConnection;
    }
}
