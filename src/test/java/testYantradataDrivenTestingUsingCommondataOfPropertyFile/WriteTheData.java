package testYantradataDrivenTestingUsingCommondataOfPropertyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteTheData {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources01\\commondata3.properties");
	    Properties PObj = new Properties();
	    
	    PObj.setProperty("Browser", "Chrome");
	    PObj.setProperty("URL", "http://rmgtestingserver:8888/");
	    PObj.setProperty("Username", "admin");
	    PObj.setProperty("Password", "admin");
	    
		FileOutputStream fOut = new FileOutputStream(".\\src\\test\\resources01\\commondata3.properties");
       PObj.store(fOut, "Write Data");
       

	    
	    
	}
	

}
