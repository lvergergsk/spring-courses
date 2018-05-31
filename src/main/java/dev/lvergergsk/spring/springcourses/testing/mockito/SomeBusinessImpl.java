package dev.lvergergsk.spring.springcourses.testing.mockito;

import java.util.Arrays;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService=dataService;
    }

    int findTheGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();
        return Arrays.stream(data).max().orElse(Integer.MIN_VALUE);
    }
}

