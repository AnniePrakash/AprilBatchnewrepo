package org.testNGsample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SuiteSample2 {
	

	@BeforeClass
	private void tc1() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	private void tc3() {
		System.out.println("After Class");
	}
	
	@Test(priority=2,invocationCount=3)
	private void tc5() {
		System.out.println("Test1");
	}
	
	@BeforeMethod
	private void tc2() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	private void tc4() {
		System.out.println("After Method");
	}
	
	@Test(priority=3,enabled=false)
	private void tc6() {
		System.out.println("Test2");
	}
	
	@Test(priority=1)
	private void tc7() {
		System.out.println("Test3");
	}

}



