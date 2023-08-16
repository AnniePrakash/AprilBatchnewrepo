package org.junitSample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTesting {
	
	
	@Test
	public void tc01() {
		
		SoftAssert soft=new SoftAssert();
		
		String s="Hanno";
		
		System.out.println("Test 1");
		
		boolean contains = s.contains("h");
		
		soft.assertTrue(contains);
		
		System.out.println(contains);
		
		System.out.println("Test 2");
		
	}
	

		
		
		
		
		
		
	}
	
	
	

	
	
