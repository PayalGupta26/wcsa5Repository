package locators2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector$ {//by using  Css Selector 
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		//$ is used -->> then we can take -->>last portion of attribute value
		driver.findElement(By.cssSelector("input[placeholder$=' number']")).sendKeys("payal@gupta26");
		
		//* is used-->> then we can take -->> in betwwen portion of the value 
		driver.findElement(By.cssSelector("input[class*='text _55r1 _6luy _'")).sendKeys("payal@123");
		
		
		//^ is used -->>then we can take -->> starting portion of the attribute value
		driver.findElement(By.cssSelector("button[class^='_4']")).click();
	}

}
