package ActionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverAction {//mouse 
	//hover action on the element -->> to perform mouse action we need to create the object of (Actions) class---> asking for the Args as(webdriver driver)
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		
		Actions act=new Actions(driver);//asking for the Args as(webdriver driver)
		
		act.moveToElement(target).perform();
		
		
		Thread.sleep(2000);
		
		//to click on the band
		WebElement target2 = driver.findElement(By.xpath("//a[text()='Band']"));
		target2.click();
	//	act.moveToElement(target2).perform();
	}

}
