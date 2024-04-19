package TestYantra_Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
	public static WebDriver driver;
	SoftAssert soft = new SoftAssert();
	
	@Test
	public void assertEqual1() {
		String expectedBrowser = "chrome";
		
		soft.assertEquals(expectedBrowser, "chrome", "match browser");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

		soft.assertEquals(expectedBrowser, "edge", "mismatch browser");
		driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");

        soft.assertAll();
	}
	
	@Test
	public void assertNotEqual1() {
		String expectedBrowser = "chrome";
		soft.assertNotEquals(expectedBrowser, "edge", "condition verify");
		driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");

		soft.assertNotEquals(expectedBrowser, "chrome", "condition not verify");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		soft.assertAll();

	}
	
	
	@Test
	public void assertSame1() {
		String expectedBrowser = "chrome";
		soft.assertSame(expectedBrowser, "chrome", "match browser");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

		soft.assertSame(expectedBrowser, "edge", "mismatch browser");
		driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");

		soft.assertAll();
	}
	
	@Test
	public void assertNotSame1() {
		String expectedBrowser = "chrome";
		soft.assertNotSame(expectedBrowser, "edge", "condition verify");
		driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");

		soft.assertNotSame(expectedBrowser, "chrome", "condition not verify");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

		soft.assertAll();
	}
	
	@Test
	public void asserNull1() {
		int b=100;
		soft.assertNull(b, "it is not null");
		System.out.println(b);
		
		String a=null;
		soft.assertNull(a, "it is null");
		System.out.println(a);
		
		soft.assertAll();
		
	}
	
	@Test
	public void asserNotNull1() {
		int b=100;
		soft.assertNotNull(b, "it is not null");
		System.out.println(b);
		
		String a=null;
		soft.assertNotNull(a, "it is not null");
		System.out.println(a);
		
		soft.assertAll();
		
		
	}
	
	


}
