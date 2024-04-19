package learntestng;

import org.testng.annotations.Test;

public class Group01 {

	@Test(groups = "functional")
	public void login() {
	System.out.println("login");	
	}
	
	@Test(groups = {"smoke","functional"})
	public void logout() {
	System.out.println("logout");	
	}
	
	@Test(groups = "system")
	public void forgotPSd() {
	System.out.println("Forgot Password");	
	}
	@Test(groups = {"functional","integration"})
	public void profile() {
	System.out.println("profile");	
	}
	
	
}
