package MethodsOfWebElement2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {//used to send the inputs to the active elements and text box
	
	public static void main(String[] args) {
		

		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("http://desktop-51heeif/login.do");
		   
		   WebElement usn = driver.findElement(By.name("username"));
		   
		   WebElement pwd = driver.findElement(By.name("pwd"));
		   
		   WebElement logButton = driver.findElement(By.id("loginButton"));
		   
		   usn.sendKeys("admin");
		   pwd.sendKeys("manager");
		   logButton.click();
		   
		   
	}

}


