package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class baseClass {

	public WebDriver driver;
	
	public WebDriver setup() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//java//resources//data.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			// select firefox
		} else {
			// select IE browser
		}
		
		String url = prop.getProperty("url");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(url);
		return driver;
	}	
}
