package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assingmentonselect {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/singalDropdown.html");
		   WebElement dropdown = driver.findElement(By.name("menu"));
		   
		   Select sel=new Select(dropdown);
		   
		   //to get all option from dropdown
		   List<WebElement> alloptions = sel.getOptions();
		   
		   //to select option by using click method
		   for (WebElement op:alloptions) 
		   { 
			   if (op.getText().equals("vadapav"))
			   {
				 Thread.sleep(2000);
				 op.click();
				 break;
				 
			   }
			
		   }
	}

}
