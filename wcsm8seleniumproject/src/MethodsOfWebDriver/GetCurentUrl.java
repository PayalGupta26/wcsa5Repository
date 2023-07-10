package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCurentUrl {
	
	public static void main(String[] args) {
		
		 ChromeOptions co = new ChromeOptions();
	      co.addArguments("--remote-allow-origins=*");
	      
	    WebDriver driver =new ChromeDriver(co);
	    
	    driver.get("https://www.instagram.com/");
	    
	   String url = driver.getCurrentUrl();
	   System.out.println(url);
	   
	   driver.close();
	}

}
