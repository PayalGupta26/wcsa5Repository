package Fram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);

		// y 2nd method to transfer the control to the chat icon---(string name or id)
		driver.switchTo().frame("fc_widget");//used id 
		
		//by using Explicitly wait
		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//  wait.until(ExpectedConditions.elementToBeClickable(By.id("chat-  WebDriverWaiticon")));
		
		WebElement element = driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster eager-load    ']/descendant::div[@id='chat-icon']"));
		Thread.sleep(2000);
//		driver.switchTo().frame(element);
		element.click();
		
		Thread.sleep(2000);
		
		//we need to transfer the control again to the paren fram -- by using ( parenFrame)
		driver.switchTo().defaultContent();

		driver.findElement(By.id("chat-fc-name")).sendKeys("payal");
		Thread.sleep(2000);

		driver.findElement(By.id("chat-fc-email")).sendKeys("payal.@1998");
		Thread.sleep(2000);

		driver.findElement(By.id("chat-fc-phone")).sendKeys("9874563210");

	
	}

}