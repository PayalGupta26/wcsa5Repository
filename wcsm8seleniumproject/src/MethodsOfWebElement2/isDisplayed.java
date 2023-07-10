package MethodsOfWebElement2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://desktop-51heeif/login.do");
			boolean logbutton = driver.findElement(By.id("loginButton")).isDisplayed();
			System.out.println(logbutton);//true
	}

}
