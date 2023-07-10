package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty("webdrivre.crome.driver","./driver.chromedriver.exe");
		
		      ChromeOptions co = new ChromeOptions();
		      co.addArguments("--remote-allow-origins=*");
		      
		    WebDriver driver =new ChromeDriver(co);
		    
		    
		    driver.get("https://www.instagram.com/");
		    
		    Thread.sleep(2000);
		     driver.close();
	}

}
