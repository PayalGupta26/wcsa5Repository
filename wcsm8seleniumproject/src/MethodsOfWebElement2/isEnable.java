package MethodsOfWebElement2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("payalgupta");
		driver.findElement(By.name("password")).sendKeys("payalgupta");

		
		boolean element = driver.findElement(By.xpath("//div[text()='Log in']")).isEnabled();
		System.out.println(element);
	}

}
