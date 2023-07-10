package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SSImplicitlyWait {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//Thread.sleep(2000);

		
		driver.get("https://www.shoppersstack.com/");
	    
		//apply explicitwait 1) create object of the webdriverwait which accepts 2 args
		//1) reff var of webdiver and 2)timeunit
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	
		
		//to click on the men img
		driver.findElement(By.xpath("//img[@alt='men']")).click();
		
		//to click on the hoodie
		//call until method which accepts 1 args (expectedconditions.(condition))
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='HOODIES']"))).click();

		
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		
		

		
		
	}

}
