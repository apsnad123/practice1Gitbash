package learntestng;

import org.testng.annotations.Test;

public class Group02 {

	@Test(groups = "functional")
	public void createNewAccount() {
	System.out.println("Create New Account");	
	}
	
	@Test(groups = "integration")
	public void home() {
	System.out.println("home");	
	}
	
	@Test(groups = "system")
	public void friendRequest() {
	System.out.println("Friend Request");	
	}
}
