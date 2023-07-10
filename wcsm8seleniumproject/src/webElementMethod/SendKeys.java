package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
	
	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("http://desktop-51heeif/login.do");
		   
		   //1)by using method chining
//		   
//		    driver.findElement(By.name("username")).sendKeys("admin");
//		    driver.findElement(By.name("pwd")).sendKeys("manager");
//		   
//		    driver.findElement(By.id("loginButton")).click();
		   
		   //2)by using store in ref-variable-we used it when we have to give inputs more then once
		   
             WebElement usernameTB1 = driver.findElement(By.name("username"));
		     WebElement pwdTB = driver.findElement(By.name("pwd"));
		     
		     usernameTB1.sendKeys("admin");
		     Thread.sleep(2000);
		     pwdTB.sendKeys("manager");
		     driver.findElement(By.id("loginButton")).click();
		   
		   
		   
	}
}
