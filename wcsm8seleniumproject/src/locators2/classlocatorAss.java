package locators2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classlocatorAss {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
//		driver.switchTo().activeElement().sendKeys("ross geller",Keys.ENTER);
//		driver.findElement(By.className("lNPNe")).click();

		
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Phoebe Buffay",Keys.ENTER);

		driver.findElement(By.className("lNPNe")).click();
	}

}
