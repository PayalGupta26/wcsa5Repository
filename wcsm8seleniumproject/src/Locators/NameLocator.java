package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NameLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver", "./drivers.cromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	ChromeDriver driver = new ChromeDriver(co);
	
	driver.get("http://127.0.0.1/login.do;jsessionid=asvccku3gcdf");
	Thread.sleep(2000);
	
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(2000);

	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
	
	

	
	
	
	}

}
