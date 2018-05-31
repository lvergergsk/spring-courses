package dev.lvergergsk.spring.springcourses.testing.junit;

import java.util.Arrays;

public class MyMath {
    int sum(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}

