package dev.lvergergsk.spring.springcourses.testing.junit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMathTest {
    @Before
    public void beforeEach() {
        System.out.println("beforeEach running");
    }

    @BeforeClass
    public static void beforeAll() {
        System.out.println("beforeAll running.");
    }

    @AfterClass
    public static void after() {
        System.out.println("afterAll running.");
    }

    @Test
    public void sum() {
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{1, 2, 3});
        System.out.println(String.format("result equals to %d", result));
        assertEquals(result, 6);
    }
}