package MethodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchTo {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver	driver=new ChromeDriver();
		
		   driver.navigate().to("https://www.google.com/");
		   Thread.sleep(2000);
		   driver.switchTo().activeElement().sendKeys("java ",Keys.ENTER);
		   
		   Thread.sleep(2000);
		   
		   driver.navigate().back();
		   
		   Thread.sleep(2000);
		   
		   driver.switchTo().activeElement().sendKeys("automation testing",Keys.ENTER);
		   
		 //  driver.navigate().back();
		   
		   
		   
		   
		   
		   
	}

}
