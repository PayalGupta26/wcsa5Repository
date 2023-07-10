package Xpath2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterLoginPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(2000);

		
		//driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-16y2uox r-1wbh5a2 r-1wzrnnt r-1udh08x r-xd6kpl r-1pn2ns4 r-ttdzmv']")).sendKeys("payal gupta");
		
		driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-18u37iz r-16')]")).sendKeys("payal gupta");
		
		
		
	}

}
