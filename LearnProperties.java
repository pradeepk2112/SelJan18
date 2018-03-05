package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnProperties {	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("./sample.properties"));
		System.out.println(prop.getProperty("URL"));
		
	}

}
