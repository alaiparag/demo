package com.qatestCase;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.qaPageObjects.brokenLink;

import resources.baseClass;

public class TC_brokenLink extends baseClass {
	ExtentReports extent;
	@BeforeTest
	public void driverinitilisation() throws IOException {
		driver = setup();
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Result");
		reporter.config().setDocumentTitle("Test Result");
		System.out.println("wgwgjava");
		System.out.println("454542java");
		
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "parag");
	}

	@Test
	public void verifyBrokenLink() throws MalformedURLException, IOException {
		ExtentTest test=extent.createTest("verifyBrokenLink");
		brokenLink bl = new brokenLink(driver);
//		for single url
//		String url = bl.brokenLink().getAttribute("href");
//		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int responseCode = conn.getResponseCode();
//		System.out.println(responseCode);
		
//      for all url	
		List<WebElement>  link=bl.links();
		for(WebElement brlinks:link) {
			String url=brlinks.getAttribute("href");
		
		
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int responseCode = conn.getResponseCode();
		
		if(responseCode>400) {
			String brlink=brlinks.getText();
			System.out.println(brlink+"="+responseCode);
		}
		
		extent.flush();
	}
	}
}
	
