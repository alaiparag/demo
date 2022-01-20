package com.qatestCase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qaPageObjects.htWidthofWebElement;

import resources.baseClass;

public class TC_dimenionsofWebElement extends baseClass {

	@BeforeTest
	public void initiaiseDriver() throws IOException {
		driver = setup();

	}

	@Test
	public void dimensions() {
		htWidthofWebElement dim = new htWidthofWebElement(driver);
		System.out.println(dim.dimesions().getRect().getDimension().getHeight());
		System.out.println(dim.dimesions().getRect().getWidth()); 
		System.out.println(dim.dimesions().getText());
		
		System.out.println(dim.dimesions().getSize());
		System.out.println("java");
		
		
		System.out.println("jsggva");
		System.out.println("jagggva");
		System.out.println("jaggva");
	}
}
