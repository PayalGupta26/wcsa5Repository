package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitWaitDemo1 {
	
	public static void main(String[] args) {
		
		
	//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		
		
	
	        WebDriver driver=new ChromeDriver();
	        
	        driver.get("https://www.shoppersstack.com/");
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	        driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__MDlEh']/descendant::img[@alt='Noise ColorFit Pulse Spo2 Smart Watch']")).click();
	        driver.findElement(By.id("Check Delivery")).sendKeys("580023");
	        
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	        
	         
	         
	        driver.findElement(By.id("Check")).click();
	        
	}

}
