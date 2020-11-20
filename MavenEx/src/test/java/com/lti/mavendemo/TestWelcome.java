package com.lti.mavendemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWelcome {
	
	@Test
    public void testShow() {        
        Welcome w= new Welcome();        
        assertEquals("Hello World - DevOps",w.show());
    }

}
