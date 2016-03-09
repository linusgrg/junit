package com.junit.testprogram;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void test() {
		MyJunitClass myTest = new MyJunitClass();
		String result = myTest.concat("hello", "world");
		assertEquals("helloworld", result);
	}

}
