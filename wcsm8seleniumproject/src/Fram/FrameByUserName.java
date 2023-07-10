package Fram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByUserName {
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/frameNew2.html");
		
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.id("i1"));
		usn.sendKeys("payal");
		
		Thread.sleep(2000);

		
	    driver.switchTo().frame("i1");
		
		Thread.sleep(3000);
		
		WebElement psw = driver.findElement(By.name("n1"));
		psw.sendKeys("payal123");
		psw.clear();
		
		driver.switchTo().parentFrame();
		usn.clear();

		
	
	}

}
