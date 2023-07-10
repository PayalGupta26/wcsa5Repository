package ActionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo {// mousehover action 
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("hp laptops");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();	
		
		WebElement target = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
	    Actions	act=new Actions(driver);
		
		act.moveToElement(target).perform();
	}

}
