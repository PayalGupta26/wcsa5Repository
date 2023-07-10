package MethodsOfWebElement2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	
	public static void main(String[] args) throws InterruptedException {
		

		 WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("https://www.facebook.com/");
		   
		  WebElement email = driver.findElement(By.id("email"));
		  
		  email.sendKeys("guptapayal@26");
		  
		  WebElement pass= driver.findElement(By.id("pass"));
		  
		  pass.sendKeys("dudu@123");
		  
		  Thread.sleep(2000);
		  
		  //clear method
		  email.clear();
		  pass.clear();
		  
		  

		   
	}

}
