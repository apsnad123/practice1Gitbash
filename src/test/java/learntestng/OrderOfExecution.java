package learntestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrderOfExecution {

@Test
public void method1() {
	System.out.println("method:1");
}

@Test
public void method12() {
	System.out.println("method:2");
}

@BeforeClass
public void bc() {
	System.out.println("--launch the browser--");
}

@AfterClass
public void ac() {
	System.out.println("--close the browser--");
}

@BeforeMethod
public void bm() {
	System.out.println("---login---");
}

@AfterMethod
public void am() {
	System.out.println("---logout---");
}

@BeforeSuite
public void bs() {
	System.out.println("---connect to database---");
}

@AfterSuite
public void as() {
	System.out.println("---close the database---");
}





















}
