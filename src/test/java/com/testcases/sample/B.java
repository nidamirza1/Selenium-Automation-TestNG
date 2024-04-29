package com.testcases.sample;

import org.testng.annotations.Test;

public class B {
	@Test
	public void b1() {
		A.a1();
		System.out.println("This is method b1");
	}
	@Test
	public void b2() {
		System.out.println("This is method b2");
	}
	@Test
	public void b3() {
		System.out.println("This is method b3");
	}

}
