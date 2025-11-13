package framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {

	
	public static Properties readData(String fileName) {
		
		Properties prop = null;
		
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Config\\"+fileName);
			
			prop = new Properties();
			prop.load(fis);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return prop;
		
	}

	public static void main (String []args) {
		
		Properties prop = readData("Config.properties");
	System.out.println(prop.getProperty("BROWSER"));	
	System.out.println(prop.getProperty("APP_URL"));	
		
		
	}
}
