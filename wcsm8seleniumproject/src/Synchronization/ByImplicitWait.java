package Synchronization;

import java.time.Duration;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByImplicitWait {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//by applying implicit wait-->> we can handled the synchronization problem
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("payal gupta");
		
		driver.findElement(By.name("password")).sendKeys("payal@123");
		
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}
