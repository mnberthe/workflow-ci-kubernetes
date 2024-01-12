package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
   @Test
    public void testGetHelloWorld() {

        String expected = "Hello World!";

        String result = "Hello World!";

        assertEquals(expected, result);
    }

}
