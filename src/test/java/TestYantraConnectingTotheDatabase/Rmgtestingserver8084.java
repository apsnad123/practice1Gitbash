package TestYantraConnectingTotheDatabase;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.jdbc.Driver;

public class Rmgtestingserver8084 {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException, SQLException {

		Random ran = new Random();
		int random = ran.nextInt(500);
		//		String expData="TY_Proj_VT55"+random;

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources01\\commondata04.properties");
		Properties pObj = new Properties();
		pObj.load(fis);

		String Browser = pObj.getProperty("browser");
		if(Browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver(); 
		}else if(Browser.equalsIgnoreCase("firfox")) {
			driver= new ChromeDriver(); 
		}else {
			System.out.println("wrong browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pObj.getProperty("url"));

		driver.findElement(By.id("usernmae")).sendKeys(pObj.getProperty("username"));
		driver.findElement(By.id("inputPassword")).sendKeys(pObj.getProperty("password"));
		driver.findElement(By.xpath("//button[.='Sign in']")).submit();

		driver.findElement(By.xpath("//a[.='Projects']")).click();
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		String projrctname = pObj.getProperty("project_name")+random;
		System.out.println(projrctname);
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(projrctname);
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys(pObj.getProperty("project_manger"));
		WebElement statusDrop = driver.findElement(By.xpath("//label[.='Project Status ']/following-sibling::select[@name='status']"));
		Select select = new Select(statusDrop);
		select.selectByValue("Created");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//===========================================================================
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%", "root");
		Statement state = con.createStatement();
		String query="select * from project where lower(project_name)='"+projrctname+"';";
		ResultSet result = state.executeQuery(query);
		System.out.println(result.getMetaData());
		while(result.next()) {
			String actual = result.getString(4);
			if(actual.equals(projrctname)) {
				System.out.println("data is present");
			}else {
				System.out.println("data is not present");

			}
		}
	}
}
