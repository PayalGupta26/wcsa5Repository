package MethodsOfWebElement2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {
	
	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		Dimension newsElement = driver.findElement(By.xpath("//h2[text()='News']")).getSize();
		int hight = newsElement.getHeight();
		int width = newsElement.getWidth();
		
		System.out.println("hight of webelemnt :"+hight+  "width of the webelemnt :"+width);
	}

}
