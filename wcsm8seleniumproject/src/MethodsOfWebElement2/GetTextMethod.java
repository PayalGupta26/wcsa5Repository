package MethodsOfWebElement2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	
	public static void main(String[] args) {
		

		 WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("https://www.instagram.com/");
//		   
//		   WebElement logButton = driver.findElement(By.xpath("//div[text()='Log in']"));
//		   
//		   String TextOfLogButton = logButton.getText();
//		   System.out.println(TextOfLogButton);
		   
		   
		   //1)by calling method directly from the printing statement
		   System.out.println(driver.findElement(By.xpath("//div[text()='Log in']")).getText());
		   
		   
		  
	}

}
