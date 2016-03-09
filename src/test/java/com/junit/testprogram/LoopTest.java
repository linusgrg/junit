package com.junit.testprogram;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoopTest {

	@Test(timeout = 100)
	public void test() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.infiniteLoop();
		assertEquals(0, result);
	}

}
