package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getWrappedElementForMSD {
	
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/multiDropdown2.html");
		WebElement MDdropdown = driver.findElement(By.id("i1"));
		
		Select sel=new Select(MDdropdown);
		
		WebElement allOptions = sel.getWrappedElement();
		
		String ops = allOptions.getText();
		
		
		
		System.out.println(ops);
	}

}
