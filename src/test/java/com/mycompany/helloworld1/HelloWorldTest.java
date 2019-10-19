
package com.mycompany.helloworld1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
    HelloWorld helloWorldInstance;
    
    @Before
    public void setUp() {
        System.out.println("* HelloWorldTest: Before method setUp()");
        helloWorldInstance = new HelloWorld();        
    }
    
    @After
    public void tearDown() {
        System.out.println("* HelloWorldTest: After method tearDown()");
        helloWorldInstance = null;
    }    
        
    @Test
    public void testFormMessage() {
                    
        String expResult = "Hello World!";
        String result = helloWorldInstance.fromMessage();
        System.out.println("* HelloWorldTest: test method 1 testFormMessage()");
        Assert.assertEquals(expResult, result);
    }   
}
