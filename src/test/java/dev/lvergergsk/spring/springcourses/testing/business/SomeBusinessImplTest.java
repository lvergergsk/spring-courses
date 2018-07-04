package dev.lvergergsk.spring.springcourses.testing.business;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomeBusinessImplTest {

    @Test
    public void calculateSum_basic(){
        SomeBusinessImpl business=new SomeBusinessImpl();
        int expected=business.calculateSum(new int[]{1,2,3});
        assertEquals(6,expected);
    }

}