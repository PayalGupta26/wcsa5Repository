package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectSingleSelectDD {//for deselecting-->> selection are mandatory
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/multiselect%20dropdown.html");
		
		WebElement Multidropdown = driver.findElement(By.name("menu"));
		
		//i st select
		Select sel=new Select(Multidropdown);
		sel.selectByIndex(2);
		Thread.sleep(2000);

		sel.selectByVisibleText("kande bhaji");
		Thread.sleep(2000);

		sel.selectByValue("v8");
		
		//then de-select
		Thread.sleep(2000);
	//	sel.deselectByIndex(2);
		Thread.sleep(2000);

	//	sel.deselectByValue("v5");
		Thread.sleep(2000);

	//	sel.deselectByVisibleText("water bottle");
		sel.deselectAll();
	}

}
