package readpropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readDataFromProperty {
	
	public static void main(String[] args) throws IOException {
		
	//	WebDriver driver = new ChromeDriver();
		
		//read data from the config.properties file
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
	   //create the object of the Properties class
	   	Properties   prop = new	Properties();
	   	
	   	//calling method-- load()// to make the file ready to read
	   	
	   	prop.load(fis);//make file ready to read
	   	
	   	
	   	String data = prop.getProperty("Browser");
	   	System.out.println(data);
	   	
	}

}
