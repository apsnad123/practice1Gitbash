package learntestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProveider {

	
	@DataProvider
	public Object[][] OrganisationInfo() {
		Object[][] obj = new Object[3][4];
	   obj[0][0]="Qspider";
	   obj[0][1]="Banglore";
	   obj[0][2]="Manual";
	   obj[0][3]=45000;
	   
	   obj[1][0]="Jspider";
	   obj[1][1]="Btm";
	   obj[1][2]="java";
	   obj[1][3]=55000;
	   
	   obj[2][0]="testYantra";
	   obj[2][1]="kattrigupe";
	   obj[2][2]="job";
	   obj[2][3]=0;
	   
	   return  obj;
	}
	
	@Test(dataProvider = "vTigerLoginCred")
	public void getData(String org,String loc, String course, int cost) {
		System.out.println("organisation:  "+org+" location: "+loc+" course: "+ course+" cost: "+cost);
	}
	
	@DataProvider
	public Object[][] vTiger() {
		Object[][] obj = new Object[3][4];
	   obj[0][0]="admin";
	   obj[0][1]="adminn";
	      
	   obj[1][0]="admin";
	   obj[1][1]="admin";
 
	   return  obj;
	}
	

}
