package Fram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByFrameWebelement {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//a[@class='gb_d']")).click();
		
		driver.switchTo().frame("app");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='MrEfLc' and @style='background-position: 0 -348px;']")).click();
		
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		
		driver.close();
		
	}
	

}
