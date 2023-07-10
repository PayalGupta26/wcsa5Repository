package methodofWebdriver2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementMethod {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://desktop-51heeif/login.do");
		
		//1) st way -->>driver.findElement(By.xpath("//input[@class='textField']")).sendKeys("admin");

		
		//works for 1st suggestion only
		WebElement usn = driver.findElement(By.xpath("//input[@class='textField']"));
		usn.sendKeys("admin");
		
		usn.sendKeys("manager");

		
		
		
		
		
		
	}

}
