package TestYantra_Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class HardAssertTest {
	
	public static WebDriver driver;
	
	@Test
	public void assertEqual1() {
		String expectedBrowser = "chrome";
//		Assert.assertEquals(expectedBrowser, "chrome", "match browser");
//		driver= new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//
//		Assert.assertEquals(expectedBrowser, "edge", "mismatch browser");
//		driver= new EdgeDriver();
//		driver.get("https://www.facebook.com/");
		assertEquals(expectedBrowser, "chrome", "match browser");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

        assertEquals(expectedBrowser, "edge", "mismatch browser");
		driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");


	}
	
	@Test
	public void assertNotEqual1() {
		String expectedBrowser = "chrome";
		assertNotEquals(expectedBrowser, "edge", "condition verify");
		driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");

		assertNotEquals(expectedBrowser, "chrome", "condition not verify");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}
	
	
	@Test
	public void assertSame1() {
		String expectedBrowser = "chrome";
		assertSame(expectedBrowser, "chrome", "match browser");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

        assertSame(expectedBrowser, "edge", "mismatch browser");
		driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");


	}
	
	@Test
	public void assertNotSame1() {
		String expectedBrowser = "chrome";
		assertNotSame(expectedBrowser, "edge", "condition verify");
		driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");

		assertNotSame(expectedBrowser, "chrome", "condition not verify");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}
	
	@Test
	public void asserNull1() {
//		int a=100;
//		assertNull(a, "it is not null");
//		System.out.println(a);
		
		String a=null;
		assertNull(a, "it is null");
		System.out.println(a);
		
	}
	
	@Test
	public void asserNotNull1() {
//		int a=100;
//		assertNotNull(a, "it is not null");
//		System.out.println(a);
		
		String a=null;
		assertNotNull(a, "it is null");
		System.out.println(a);
		
	}
	
	


}
