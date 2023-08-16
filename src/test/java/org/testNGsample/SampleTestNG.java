package org.testNGsample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestNG {
	
	WebDriver driver;
	
	@BeforeClass
	private void tc01() {
		WebDriverManager.edgedriver().setup();
		
		driver=new EdgeDriver();
		
	}
	
	@AfterClass
	private void tc03() {
		
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
	@Test
	private void tc05() {
		
		driver.findElement(By.id("email")).sendKeys("Shawn");
	}
	
	@BeforeMethod
	private void tc02() {
		
		driver.get("https://www.facebook.com/");
	}
	
	
	@AfterMethod
	private void tc04() throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		
		File file=new File("C:\\Users\\USER\\Desktop\\Prakash\\testngscreen.jpeg");
		
		FileUtils.copyFile(screenshotAs, file);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
