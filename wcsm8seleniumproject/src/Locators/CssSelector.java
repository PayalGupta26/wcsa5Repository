package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelector {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.crome.driver", "./drivers.cromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	ChromeDriver driver = new ChromeDriver(co);
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.name("username")).sendKeys("ahwfybv");
	Thread.sleep(2000);

	driver.findElement(By.name("password")).sendKeys("abcdef");
	
	driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();

	
	}

}
