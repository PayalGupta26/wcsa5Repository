package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOPtion {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/multiselect%20dropdown.html");

		WebElement Multidropdown = driver.findElement(By.name("menu"));
		Select Sel=new Select(Multidropdown);
		
		for (int i = 0; i < 6; i++) {
			Sel.selectByIndex(i);
			Thread.sleep(1000);
			}
		
		
	}

}
