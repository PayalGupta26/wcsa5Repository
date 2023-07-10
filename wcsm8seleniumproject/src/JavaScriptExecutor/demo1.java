package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        driver.get("https://www.selenium.dev/downloads/");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;//downcasting
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(500,0)");//scroll right
		
		Thread.sleep(2000);

		jse.executeScript("window.scrollBy(-500,0)");//scroll left
		 
		Thread.sleep(2000);
		
        jse.executeScript("window.scrollBy(0,1000)");//scroll right
		
		Thread.sleep(2000);

		jse.executeScript("window.scrollBy(0,-1000)");//scroll left

		
	}

}
