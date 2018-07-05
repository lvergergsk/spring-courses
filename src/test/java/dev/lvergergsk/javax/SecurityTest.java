package dev.lvergergsk.javax;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecurityTest {
    Security security;

    @Before
    public void before(){
        security=new Security();
    }

    @Test
    public void sign01() throws Exception{
        System.out.println(Security.sign("abc","def"));
    }
}