package pomrepo;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import com.qsp.trllo.genricUtility.BaseClass;

public class CreateAndDeleteBoard extends BaseClass {
	@Test
	
	public void  checkWhetherTheEndUserIsAbleTOCreateAndDeleteRheBoard() throws InterruptedException, IOException {
		TrelloHomePage homepage= new TrelloHomePage(driver);
		TrelloLoginPage loginpage= new TrelloLoginPage(driver);
		homepage.getLoginLink().click();
		Thread.sleep(3000);
		loginpage.getUsernameTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("email"));
		Thread.sleep(3000);
		
		loginpage.getContinueButton().submit();
		Thread.sleep(3000);

		loginpage.getPasswordTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("password"));
		Thread.sleep(3000);

		loginpage.getLoginButton().submit();

	}

}
