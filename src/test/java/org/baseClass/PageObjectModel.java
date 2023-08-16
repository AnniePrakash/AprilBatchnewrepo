package org.baseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel extends BaseClass {
	
	public PageObjectModel() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(id="location")
	private WebElement location;

	public WebElement getUserName() {
		return userName;
	}
	

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getLocation() {
		return location;
	}

	
	
	

}
