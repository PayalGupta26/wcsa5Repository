package Dropdown;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectmultipleOption {//with help of for loop

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/multiselect%20dropdown.html");

		WebElement Multidropdown = driver.findElement(By.name("menu"));
		Select Sel=new Select(Multidropdown);
		
		//select multiple options by using fro loop
		for (int i = 0; i < 5; i++) {
			
		    Sel.selectByIndex(i);
		    Thread.sleep(2000);
			}
		
	//	de-select multiple options by using for loop
       
		for (int i = 0; i < 5; i++) {
			
		    Sel.deselectByIndex(i);
		    Thread.sleep(1000);
			}
			
		
		


	}

}
