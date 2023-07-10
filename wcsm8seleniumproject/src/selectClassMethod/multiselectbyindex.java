package selectClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectbyindex {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/multiselect%20dropdown.html");
		   WebElement multidropdown = driver.findElement(By.name("menu"));
		   Select sel=new Select(multidropdown);
		   
		   
		   //selecting even value from multiselect dropdown using for loop
		   for (int i = 0; i < 8; i++)
		   {
			   if (i%2==0)
			     {
				    sel.selectByIndex(i);
			     }
			   else
			   {
				   System.out.println("its a odd no");
			   }
			
		   }
	}

}
