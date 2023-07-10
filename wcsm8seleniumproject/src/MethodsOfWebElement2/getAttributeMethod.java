package MethodsOfWebElement2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeMethod {//to get the attributes of the webelement
	
	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   
		   //getting the attribute of username textbox
		   String webelement = driver.findElement(By.name("username")).getAttribute("class");
		   System.out.println(webelement);
	}

}
