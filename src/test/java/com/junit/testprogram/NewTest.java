package com.junit.testprogram;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewTest {

	@Test
	public void test() {
		MyJunitClass test = new MyJunitClass();
		int result = test.add(2, 6);
		assertEquals(8, result);
	}

}
