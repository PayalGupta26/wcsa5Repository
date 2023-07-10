package locators2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentclassL {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/ClassLocatordemo.html");
		
//		tagname working for only for the first suggession
//		driver.findElement(By.tagName("input")).sendKeys("admin");
//		driver.findElement(By.tagName("input")).sendKeys("manager");
        
//		//by using id 
//		driver.findElement(By.id("n1")).sendKeys("admin");
//		driver.findElement(By.id("n2")).sendKeys("manager");
//		
//		//by using name
//		driver.findElement(By.name("n1")).sendKeys("admin");
//		driver.findElement(By.name("n2")).sendKeys("manager");
		
		//by using classvname-->> work for 1st suggession bcoz same class value same as tagname
		driver.findElement(By.className("class1")).sendKeys("admin");
		driver.findElement(By.className("class1")).sendKeys("manager");
				
	}

}
