package org.newMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenIntro {
	
	public static void main(String[] args) {
		
		//set the property of the browser
		
		WebDriverManager.chromedriver().setup();
		
		//initialize the webdriver
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
	}
	
	

}
