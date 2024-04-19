package learntestng;

import org.testng.annotations.Test;

public class AnnotationAndArgumentTest {
	
	@Test(priority = 1)
	public void login() {
		System.out.println("Login");	
		}
	
	@Test(priority = 6, invocationCount = 4)
	public void logout() {
	System.out.println("Logout");	
	}
	
	@Test(priority = 2, dependsOnMethods = "login")
	public void homepage() {
		System.out.println("homepage");	
		}
	
	@Test(priority = 3, dependsOnMethods = {"login","homepage"})
	public void product() {
	System.out.println("product");	
	}
	
	@Test(priority = 4, dependsOnMethods = {"login","homepage","product"}, enabled = false)
	public void addToCart() {
		System.out.println("addToCart");	
		}
	
	@Test(priority = 5, dependsOnMethods = {"login","homepage","product"})
	public void Payement() {
	System.out.println("Payement");	
	}
	
	
}
