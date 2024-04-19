package learntestng;

import org.testng.annotations.Test;

public class Group03 {
	@Test(groups = "functional")
	public void product() {
	System.out.println("Product");	
	}
	
	@Test(groups = "integration")
	public void payement() {
	System.out.println("Payement");	
	}
	
	@Test(groups = {"smoke","integration"})
	public void signUp() {
	System.out.println("Sign Up");	
	}

}
