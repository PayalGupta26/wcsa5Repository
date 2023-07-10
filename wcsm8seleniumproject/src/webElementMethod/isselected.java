package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {
	
	//return type is boolean / if webElement is selected true, if not selected false
	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-51heeif/login.do");
		WebElement checkbox = driver.findElement(By.name("remember"));
		
		boolean sel = checkbox.isSelected();
		
		System.out.println(sel);
	}

}
