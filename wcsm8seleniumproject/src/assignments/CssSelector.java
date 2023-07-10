package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	
	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.cssSelector("input[id$='o2']")).click();
		
		driver.findElement(By.cssSelector("textarea[id^='t']")).sendKeys("it is an blogspot website");
		
		driver.findElement(By.cssSelector("button[onclick^='setTimeout(myFunctionAB']")).click();
	
	}

}
