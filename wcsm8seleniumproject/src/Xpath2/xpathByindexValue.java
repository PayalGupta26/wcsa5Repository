package Xpath2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByindexValue {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		//to handled pop up
		driver.findElement(By.xpath("//button[text()='✕']")).click();

		
		//to navigate through navigation bar -->to navigate to glossary
		driver.findElement(By.xpath("(//div[@class='eFQ30H'])[1]")).click();
		
		//click on glossary the asked for the verification code
		
		
	}

}
