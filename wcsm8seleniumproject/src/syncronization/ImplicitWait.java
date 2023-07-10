package syncronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {
	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    WebDriver	driver=new ChromeDriver();
	    driver.get("https://www.instagram.com/");
	    
	    //used implicit wait to match the time of automation script and internet speed
	    //
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    
	    driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("password")).sendKeys("admin@123");
	    driver.findElement(By.xpath("//div[text()='Log in']")).click();
	    
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(0))
		
	}

}
