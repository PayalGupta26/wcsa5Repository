package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramPage {
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		//here we apply the static wait
		Thread.sleep(20);
		
		driver.findElement(By.name("username")).sendKeys("payal gupta");
		
		driver.findElement(By.name("password")).sendKeys("payal@123");
		
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}
