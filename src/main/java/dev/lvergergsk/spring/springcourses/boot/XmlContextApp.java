package dev.lvergergsk.spring.springcourses.boot;

import dev.lvergergsk.spring.springcourses.boot.xml.XmlPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XmlContextApp {
    private static Logger LOGGER = LoggerFactory.getLogger(XmlContextApp.class);

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            LOGGER.info("Beans Loaded ->{}",(Object) classPathXmlApplicationContext.getBeanDefinitionNames());
            XmlPersonDao xmlPersonDao = classPathXmlApplicationContext.getBean(XmlPersonDao.class);
            LOGGER.info("{}, JDBC connection: {}", xmlPersonDao, xmlPersonDao.getXmlJdbcConnection());
        }
    }
}
