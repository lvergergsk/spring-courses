package dev.lvergergsk.spring.springcourses.testing.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class ListTest {

    List<String> listMock;

    @Before
    public void before() {
        listMock = mock(List.class);
    }

    @Test
    public void test_multipleReturns() {
        when(listMock.size()).thenReturn(10).thenReturn(20);
        when(listMock.get(0)).thenReturn("something");

        assertEquals(10, listMock.size());
        assertEquals(20, listMock.size());
        assertEquals(20, listMock.size());
        assertEquals("something", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    public void returnWithParameter() {
        when(listMock.get(0)).thenReturn("something");
        assertEquals("something", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    public void returnWithGenericParameter() {
        when(listMock.get(anyInt())).thenReturn("something");
        assertEquals("something", listMock.get(1));
        assertEquals("something", listMock.get(3));
        assertEquals("something", listMock.get(6));
        assertEquals("something", listMock.get(24));
    }

    //    verify number of invocations.
    @Test
    public void verificationBasics() {
        assertNull(listMock.get(0));
        assertNull(listMock.get(1));

        verify(listMock).get(0);
        verify(listMock, times(2)).get(anyInt());
        verify(listMock, atLeast(1)).get(anyInt());
        verify(listMock, atLeastOnce()).get(anyInt());
        verify(listMock, atMost(2)).get(anyInt());
        verify(listMock, never()).get(2);
    }

    @Test
    public void argumentCapturing() {
        listMock.add("something");

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(listMock).add(captor.capture());

        assertEquals("something", captor.getValue());
    }

    @Test
    public void multipleArgumentCapturing() {
        listMock.add("something1");
        listMock.add("something2");

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(listMock, times(2)).add(captor.capture());

        List<String> allValue = captor.getAllValues();
        assertEquals("something1", allValue.get(0));
        assertEquals("something2", allValue.get(1));
    }

    @Test
    public void spying() {
        ArrayList<String> arrayListMock = mock(ArrayList.class);
        assertNull(arrayListMock.get(0));
        assertEquals(0, arrayListMock.size());
        arrayListMock.add("something1");
        arrayListMock.add("something2");


    }
}
