package MethodsOfWebElement2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Point webelement = driver.findElement(By.xpath("//button[text()=' Login ']")).getLocation();
		int xaxis = webelement.getX();
		int yaxis = webelement.getY();
		
		System.out.println("xaxis of webelement :"+xaxis+ " yaxis of webelement :"+yaxis);
		
//		System.out.println(xaxis);
//		System.out.println(yaxis);
		
		
	}
}
