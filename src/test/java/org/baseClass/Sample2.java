package org.baseClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 {
	

	@BeforeClass
	private void tc1() {
		System.out.println("Before Class");
		
	}
	@BeforeMethod
	private void tc4() {
		System.out.println("Before Method");
		
	}
	@Test(priority=2)
	private void tc5() {
		System.out.println("TC5");
		
	}
	@AfterClass
	private void tc2() {
		System.out.println("After Class");
		
	}
	@AfterMethod
	private void tc3() {
		System.out.println("After Method");
		
	}
	
	@Test(priority=1,enabled=true,invocationCount=3)
	private void tc6() {
		System.out.println("TC6");
		
	}
	
	
	@Test(priority=3)
	private void tc7() {
		System.out.println("TC7");
	
	}
	
	
	
}



}
