package locators2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-51heeif/login.do");
		driver.findElement(By.cssSelector("input[name^='u']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type*='sword']")).sendKeys("manager");

		driver.findElement(By.cssSelector("a[class$='l']")).click();

		
	}

}
