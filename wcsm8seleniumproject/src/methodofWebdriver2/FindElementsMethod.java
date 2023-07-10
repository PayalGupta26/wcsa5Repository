package methodofWebdriver2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/");
		
		driver.switchTo().activeElement().sendKeys("bikes");
		
		Thread.sleep(2000);
		
		//by using findElements method-->>store it into the variable 
		List<WebElement> bikes = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		
		//for using for loop
//		for (int i = 0; i < bikes.size(); i++) {
//			
//			String bikesoption = bikes.get(i).getText();
//			System.out.println(bikesoption);
//			Thread.sleep(2000);
//			
//		}
		
		
		//by using for each loop
		for (WebElement we : bikes) {
			
			String bikesoption = we.getText();
			System.out.println(bikesoption);
			Thread.sleep(2000);
			
		}
		
	}

}
