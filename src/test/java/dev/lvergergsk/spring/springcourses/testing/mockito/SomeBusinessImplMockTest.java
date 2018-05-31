package dev.lvergergsk.spring.springcourses.testing.mockito;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplMockTest {
    @Test
   public void findTheGreatestFromAllData() {
        DataService dataServiceMock = mock(DataService.class);
//        dataServiceMock.retrieveAllData()=>new int[]{24,15,3};

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{42,1,2,65});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.findTheGreatestFromAllData();
        System.out.println(result);
        assertEquals(65, result);
    }
}
