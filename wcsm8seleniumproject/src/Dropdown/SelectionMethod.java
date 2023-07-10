package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/singalDropdown.html");
		
		WebElement singleSelect = driver.findElement(By.id("i1"));
		Select sel=new Select(singleSelect);
		Thread.sleep(2000);
		
		
		//methods of selection
	//	sel.selectByIndex(2);
	//	sel.selectByVisibleText("pakoda");
		sel.selectByValue("v6");
		
		
	
	}

}
