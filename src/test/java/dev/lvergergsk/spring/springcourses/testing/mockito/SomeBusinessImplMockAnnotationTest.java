package dev.lvergergsk.spring.springcourses.testing.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

// Test need to be public
@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessImplMockAnnotationTest {
    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl someBusiness;

//    @Before
//    void before(){
//        MockitoAnnotations.initMocks(this);
//    }

    @Test
    public void findTheGreatestFromAllData() {
        when(this.dataServiceMock.retrieveAllData()).thenReturn(new int[]{42, 1, 2, 65});
        int result = someBusiness.findTheGreatestFromAllData();
        System.out.println(result);
        assertEquals(65, result);
    }
}
