package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();//upcasting to webdriver
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;//downcasting
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(5000,0)");//scroll right
		
		Thread.sleep(2000);

		jse.executeScript("window.scrollBy(-5000,0)");//scroll left

//		jse.executeScript("window.scrollBy(0,350)");//scroll down
//
//		jse.executeScript("window.scrollBy(0,-400)");//scroll up

		
		
		
		
		
		
		
		
		
		}

}
