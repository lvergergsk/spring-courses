package dev.lvergergsk.spring.springcourses.boot.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SomeCDIBusinessTest {
    @InjectMocks
    SomeCDIBusiness someCDIBusiness;

    @Mock
    SomeCdiDao daoMock;

    @Test
    public void testFindGreatest() {

        Mockito.when(daoMock.getData()).thenReturn(new int[]{2, 4});

        int result = someCDIBusiness.findGreatest();
        assertEquals(4, result);
    }
}
