package Xpath2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForFlipcart {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(4000);
		driver.get("https://www.flipkart.com/");
		
		
		//to close pop up
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//enter product in serch box
		driver.findElement(By.name("q")).sendKeys("hp laptop");

		//click on search icon
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		
		//click on processor
	//	driver.findElement(By.xpath("//div[text()='Processor']")).click();
		
		
	//	driver.findElement(By.xpath("//div[text()='HP 247 G8 Athlon Dual Core - (8 GB/1 TB HDD/Windows 11 Home) 247 G8 Notebook Notebook']/../..//div[text()='₹23,890']"));
		
	}

}
