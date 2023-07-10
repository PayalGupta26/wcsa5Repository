package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//by applying implicit wait wee can handled the synchronization problem
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//	driver.navigate().to("https://www.flipkart.com/");
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	//	driver.findElement(By.xpath(""))
		
	}

}
