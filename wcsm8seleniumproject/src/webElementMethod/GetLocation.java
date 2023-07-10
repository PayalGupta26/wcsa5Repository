package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {//to get the location of webelement-->> return type is point class
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		WebElement value = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']"));
		Point loc = value.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		System.out.println("x axis:"+xaxis+" y axis:"+yaxis);
		
		
		


	}

}
