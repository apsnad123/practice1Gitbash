package com.qsp.trllo.genricUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriverUtility webdriverUtils= new WebDriverUtility();
	public static FileUtillity fileUtils= new FileUtillity();
	
	@BeforeMethod
	public void preCondition() throws IOException {
		String browserName= fileUtils.readTheDataFromPropertyFile("browser");
		if(browserName.equals("chrome")) {
			driver= new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			driver= new FirefoxDriver();
		}else if(browserName.equals("edge")) {
			driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		webdriverUtils.impliciWait(driver);
		driver.get(fileUtils.readTheDataFromPropertyFile("url"));
	}
	
	@AfterMethod
	public void postCondition() {
		driver.manage().window().maximize();
		driver.quit();

	}

}
