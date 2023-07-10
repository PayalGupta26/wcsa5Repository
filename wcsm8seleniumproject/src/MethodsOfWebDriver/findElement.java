package MethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;

public class findElement {//
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	WebDriver	driver=new ChromeDriver(co);
	
	driver.get("http://desktop-51heeif/login.do");
	
	//store the add of the textbox inside the ref variable
	 WebElement UserNameTextBox = driver.findElement(By.name("username"));
	 UserNameTextBox.sendKeys("admin");
	 System.out.println(UserNameTextBox);//get add
	 
	 
		
	}

}
