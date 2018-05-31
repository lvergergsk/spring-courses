package dev.lvergergsk.spring.springcourses.testing.mockito;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    public void test_multipleReturns(){
        List listMock=mock(List.class);
        when(listMock.size()).thenReturn(10).thenReturn(20);
        when(listMock.get(0)).thenReturn("something");

        assertEquals(10,listMock.size());
        assertEquals(20,listMock.size());
        assertEquals(20,listMock.size());
        assertEquals("something",listMock.get(0));
        assertEquals(null,listMock.get(1));
    }
}
