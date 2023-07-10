package selectClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;//select class to handle dropdown we can handle only static dropdown 
                                             //static --> design by the select tag

public class SelectByVisibleText {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/singalDropdown.html");
		   WebElement dropdown = driver.findElement(By.name("menu"));
		  Select sel=new Select(dropdown);
		  sel.selectByVisibleText("vadapav");
	}

}
