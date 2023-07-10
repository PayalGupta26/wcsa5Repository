package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getWrappedElement {//used to read all the op from the dd by considering that op as a single webelement
	                            //return type-->.WebElemnt  (diff betn getOptions and getWrappedElement)
	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/singalDropdown.html");
		
		
		WebElement SSdropdown = driver.findElement(By.id("i1"));
		
		Select sel=new Select(SSdropdown);
		
		WebElement ops = sel.getWrappedElement();
		
		System.out.println(ops.getText());
		
	}

}
