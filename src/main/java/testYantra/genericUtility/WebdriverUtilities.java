package testYantra.genericUtility;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebdriverUtilities {

	/*this method is used to switch one window to another window using
	1. driver
	2. url
	*/
	public void switchWindow(WebDriver driver,String url) 
	{
		Set<String> allWindow = driver.getWindowHandles();
		for (String singleWindow : allWindow) {
			driver.switchTo().window(singleWindow);
		   String text = driver.getCurrentUrl();
		   if(text.contains(url)) {
			   break;
		   }
		   
		}
	}
}
