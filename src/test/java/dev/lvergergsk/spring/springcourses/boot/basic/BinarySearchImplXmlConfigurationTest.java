package dev.lvergergsk.spring.springcourses.boot.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations= "classpath:testContext.xml")
public class BinarySearchImplXmlConfigurationTest {

    @Autowired
    public BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        int result = binarySearch.binarySearch(new int[]{}, 5);
        assertEquals(3, result);
    }

}
