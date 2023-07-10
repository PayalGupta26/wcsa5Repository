package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
	
	public static void main(String[] args) {
		
	//S	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver	driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.instagram.com/");
	   WebElement element = driver.findElement(By.xpath("//div[text()='Log in']"));
	   boolean loginBTN = element.isEnabled();
	   System.out.println(loginBTN);
	    
	    	    
	}

}
