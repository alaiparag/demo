package com.qaPageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class brokenLink {

	
	public WebDriver driver;
	
	@FindBy (css="a[href*='brokenlink']")
	WebElement brokenLink;
	
	@FindBy (css="li[class='gf-li'] a")
	List<WebElement> links;
	
	public brokenLink(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement brokenLink() {
		return brokenLink;
	}
	
	public List<WebElement> links() {
		return links;
	}	
}
