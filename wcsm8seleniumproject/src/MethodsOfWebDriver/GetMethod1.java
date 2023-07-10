package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethod1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		 ChromeOptions co = new ChromeOptions();
	      co.addArguments("--remote-allow-origins=*");
	      
	    WebDriver driver =new ChromeDriver(co);
	    
	    
	    //launch web application
	    driver.get("https://www.instagram.com/");
	    
	    driver.manage().window().maximize();
	    
	    
	    Thread.sleep(2000);
	    
	    driver.close();
	    
	    
	}

}
