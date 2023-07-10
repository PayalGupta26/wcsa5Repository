package Xpath2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OhrmByUsingContains {//login page of the orangeHRM HAndle by the contains function of xpath
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//to enter username
		driver.findElement(By.xpath("//input[contains(@name,'us')]")).sendKeys("admin");
		
		//to enter value in the password 
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("admin123");
		
		//to click on the login button
		driver.findElement(By.xpath("//button[contains(@class,'oxd')]")).click();
		
	}

}
