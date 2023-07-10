package MethodsOfWebElement2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethos {
	
	public static void main(String[] args) {
		

		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   WebElement usn = driver.findElement(By.name("username"));
		   WebElement pwd = driver.findElement(By.name("password"));
		   
		   WebElement logButton = driver.findElement(By.xpath("//button[text()=' Login ']"));
		   
		   //by using send keys
		   usn.sendKeys("admin");
		   pwd.sendKeys("admin123");
		   
		   //click method of the WebElement
		   logButton.click();

		   
		   

	}

}
