package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDDSelectionMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/multiselect%20dropdown.html");
		
		WebElement multiDd = driver.findElement(By.name("menu"));
		Select sel=new Select(multiDd);//create the object of the select class which asked for the one argument(webelement element i.e dropdown=multiDd)
		//sel.selectByIndex(2);
		Thread.sleep(2000);
	//	sel.selectByVisibleText("kande bhaji");
		
		sel.selectByValue("v4");
	}

}
