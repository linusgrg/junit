package com.junit.testprogram;

public class MyJunitClass {
	public int add(int a, int b) {
		return a + b;
	}

	public String concat(String a, String b) {
		return a + b;
	}

	public int infiniteLoop() {
		int a=1;
		int b=1;
		while(b==a){
			a=1;
		}
		return 0;
		

	}

}
