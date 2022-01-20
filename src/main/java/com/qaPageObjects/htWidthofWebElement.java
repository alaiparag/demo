package com.qaPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class htWidthofWebElement {

	public WebDriver driver;
	
	@FindBy (id="dropdown-class-example")
	WebElement dimensions;
	
	public htWidthofWebElement(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement dimesions() {
		return dimensions;
	}
	
	
	
}
