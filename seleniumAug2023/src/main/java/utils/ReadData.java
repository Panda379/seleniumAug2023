package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	String path=".//src//main//resources//testData//data.property";
	Properties prop;
	
	public ReadData() throws IOException {
		prop = new Properties();
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		
	}
	
	public String getUsername() {
		return prop.getProperty("username");
	}
	
	public String getPassword() {
		return prop.getProperty("password");
	}
	
	public String getEmail() {
		return prop.getProperty("email");
	}
	
	public String getPincode() {
		return prop.getProperty("pinCode");
		
	}
	
	public String getFirstname() {
		return prop.getProperty("firstName");
	}
	
	public String getLastname() {
		return prop.getProperty("lastName");
	}
	
}
