package syncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class syncronization {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver", "./drivers/chromedriver.exe");
		
	    WebDriver	driver=new ChromeDriver();
	    driver.get("https://www.instagram.com/");
	    
	    
	    driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("password")).sendKeys("admin@123");
	    driver.findElement(By.xpath("//div[text()='Log in']")).click();
	    
	    
	    
	
	
	}

}
