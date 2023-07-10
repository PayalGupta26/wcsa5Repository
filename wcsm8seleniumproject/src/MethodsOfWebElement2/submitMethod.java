package MethodsOfWebElement2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitMethod {
	
	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		//Illegal state exception
     //   System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("payalgupta");
		driver.findElement(By.name("password")).sendKeys("payalgupta");
		WebElement log= driver.findElement(By.xpath("//button[contains(@class,'_acan _acap ')]"));
		log.submit();
	}

}
