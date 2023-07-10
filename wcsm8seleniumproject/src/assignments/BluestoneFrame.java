package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BluestoneFrame {
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By);
		
		Thread.sleep(2000);
		
		//switch control to the chat box frame
	    WebElement FerameElement = driver.findElement(By.xpath("//iframe[@name='fc_widget']"));
	    
	    driver.switchTo().frame("fc_widget");
		
	    
	    WebElement chatbox = driver.findElement(By.id("chat-icon"));
		
		
		
		//used explicit wait clickable by webelement
	      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	      wait.until(ExpectedConditions.elementToBeClickable(chatbox)).click();
	      
	      driver.findElement(By.id("chat-fc-name")).sendKeys("payal123");
	      driver.findElement(By.id("chat-fc-email")).sendKeys("admin@123");
	      driver.findElement(By.id("chat-fc-phone")).sendKeys("9687564125");
	      
	      
	      
	      
	      
	}

}
