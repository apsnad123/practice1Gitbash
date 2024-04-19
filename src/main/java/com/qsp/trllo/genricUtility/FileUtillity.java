package com.qsp.trllo.genricUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtillity {
 
	public String readTheDataFromPropertyFile(String Key) throws IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources01/commondata04.properties");
		Properties pobj= new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(Key);
		return value;
	}

}
