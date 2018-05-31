package dev.lvergergsk.spring.springcourses.testing.mockito;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SomeBusinessImplStubTest {

    @Test
    public void findTheGreatestFromAllData() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub());
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(65, result);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{42, 1, 2, 65};
    }
}