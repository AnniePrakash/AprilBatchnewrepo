package org.baseClass;




import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample extends BaseClass {
	
	PageObjectModel element;
	private String t1;
	
	
	@BeforeClass
	private void urlLaunch() {
		
		browserLaunch("chrome");
		maximize();
		loadUrl("https://adactinhotelapp.com/");
		
		element=new PageObjectModel();
		}
	@Test(priority=1)
	private void loginPage() {
		
		WebElement userName = element.getUserName();
		userName.sendKeys("prakashshawn");
		
		WebElement password = element.getPassword();
		password.sendKeys("LVXBEO");
		
		WebElement login = element.getLogin();
		login.click();
		
		String title = title();
		Assert.assertEquals(title, "Adactin.com - Search Hotel");
		
		System.out.println(title);
							
	}
	
	@Test(priority=2)
	private void searchHotel() {
		
		WebElement location = element.getLocation();
		
		dropDown(location,"text", "Melbourne");
		
		
		
			
	}

}
