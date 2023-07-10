package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultipleMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/multiselect%20dropdown.html");

		WebElement Multidropdown = driver.findElement(By.name("menu"));
		Select Sel=new Select(Multidropdown);
		
		//isMultiple method -->. to check whether the DD is singal select or the multi select
		//return boolean value --> if Dd is multiSelect -->>return true
		boolean value = Sel.isMultiple();
		System.out.println(value);
	
	}

}
