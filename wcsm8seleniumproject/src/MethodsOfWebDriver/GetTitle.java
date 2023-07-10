package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitle {
    
	public static void main(String[] args) {
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver	driver=new ChromeDriver(co);
		
		driver.get("https://www.instagram.com/");
		
	  String loginpagetitle	=driver.getTitle();
	  
	  System.out.println(loginpagetitle);
	  
	  driver.close();
		
	}
}
