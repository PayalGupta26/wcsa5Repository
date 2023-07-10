package selectClassMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllOptions {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/singalDropdown.html");
		   WebElement dropdown = driver.findElement(By.name("menu"));
		   
		   Select sel=new Select(dropdown);
		   
		   List<WebElement> Alloption = sel.getOptions();
		  
		   //by using for loop
//		   for (int i = 0; i < Alloption.size(); i++)
//		   {
//			  String option = Alloption.get(i).getText();
//			  System.out.println(option);
//			  }
		   
		   
		   
	}

}
