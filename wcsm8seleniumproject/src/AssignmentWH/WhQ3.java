package AssignmentWH;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhQ3 {//how to close child browser
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://omayo.blogspot.com/");
		
		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		
		
		//scrolling till the link of omayo
		JavascriptExecutor jse=(JavascriptExecutor)driver;//downcasting
		
           Point point = link.getLocation();
           int xaxis = point.getX();
           int yaxis = point.getY();
		
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")" );
		
		Thread.sleep(2000);
		
		link.click();
		
		String parentHandle = driver.getWindowHandle();
		
		Set<String> AllHandled = driver.getWindowHandles();
		
		Thread.sleep(2000);

		
		for (String wh: AllHandled) {
			
			if (! parentHandle.equals(wh)) {
				
				driver.switchTo().window(wh).close();
				
			 }
			
			
		}
		
	}

}
