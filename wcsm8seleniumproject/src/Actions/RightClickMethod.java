package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod {
	
	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("https://www.selenium.dev/downloads/");
		   
		  WebElement link = driver.findElement(By.linkText("4.9.0"));
		  
		  //to perform  mouse action we need to create the obj of actions class
		  
		  Actions act=new Actions(driver);
		  
		  //to perform right click action
		   act.contextClick(link).perform();
	}

}
