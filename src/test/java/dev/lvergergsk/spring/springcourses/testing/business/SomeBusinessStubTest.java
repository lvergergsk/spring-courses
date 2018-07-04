package dev.lvergergsk.spring.springcourses.testing.business;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// require 1 stub for 1 input for this approach.
class SomeDataServiceStub implements SomeDataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{1, 2, 3};
    }
}

@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
public class SomeBusinessStubTest {

    @InjectMocks
    SomeBusinessImpl business=new SomeBusinessImpl();

    @Before
    public void before(){
        // create mock here.
    }

    @Test
    public void calculateSumUsingDataService_stub() {

        business.setSomeDataService(new SomeDataServiceStub());

        int actualResult = business.calculateSumUsingDataService();
        int expectResult = 6;
        assertEquals(actualResult, expectResult);
    }

    @Test
    public void calculateSumUsingDataService_mock(){
//        Require statically import mockito.
        SomeDataService dataService=mock(SomeDataService.class);
        when(dataService.retrieveAllData()).thenReturn(new int[]{4,5,6});

        business.setSomeDataService(dataService);

        int actualResult = business.calculateSumUsingDataService();
        int expectResult = 15;
        assertEquals(actualResult, expectResult);


    }
}
