package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovertoCoin {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   ;
		   driver.get("https://www.bluestone.com/");
		   
		   driver.findElement(By.id("denyBtn")).click();
		   
		  WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));
		  
		  //ctrate obj of action class to move to thr coin
		  Actions act=new Actions(driver);
		  //use this method 
		  act.moveToElement(target).perform();
		  driver.findElement(By.xpath("//span[@data-p='gold-coins-22-weight-1gms,m']")).click();
		  
		  WebElement coin = driver.findElement(By.xpath("//div[@class='mousetrap']"));
		 
		  if (coin.isDisplayed()) {
			  
			  driver.close();
			//  System.out.println(coin);
		}
		  
		  else {
			System.out.println("element is not displaed!!! getting Exception");
		}
		  
		  
//		 boolean result = coin.isDisplayed();
//		 System.out.println(result);
	}

}
