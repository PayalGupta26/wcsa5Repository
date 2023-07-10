package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		//scroll right
		jse.executeScript("window.scrollBy(5000,0)");
		
		Thread.sleep(2000);

		jse.executeScript("window.scrollBy(-5000,0)");

	}

}
