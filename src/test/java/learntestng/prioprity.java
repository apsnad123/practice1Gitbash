package learntestng;

import org.testng.annotations.Test;

public class prioprity {

	
	@Test(priority = 1)
	public void login() {
		System.out.println("login");
	}
	@Test(priority = 5)
	public void logout() {
		System.out.println("logout");
	}
	@Test(priority = 2)
	public void home() {
		System.out.println("home");
	}
	@Test(priority = 3)
	public void product() {
		System.out.println("product");
	}
	@Test(priority = 4)
	public void addtocart() {
		System.out.println("addtocart");
	}
	@Test(priority = 5)
	public void paymemet() {
		System.out.println("payement");
	}
}
