package assignments;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDublicates {
	
	//By using Treeset from Dropdown
public static void main(String[] args) throws InterruptedException {
	
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/singalDropdown.html");
	     WebElement dropdown = driver.findElement(By.name("menu"));
	     
	     //to handle dropdoen create obj of select class
	     
	     Select sel=new Select(dropdown);
	     
	     //to get all options from dropdown //and store in variable
	     
	     List<WebElement> allOption = sel.getOptions();
	     
	     //to eleminate dublicate and maintain the order of insertion used treeSet
	     
	     
	     TreeSet<String> ts=new TreeSet<String>();
	     
	     //to read list by eleminating dublicates
	     
	     for (int i = 0; i < allOption.size(); i++)
	     {
			String option = allOption.get(i).getText();
			ts.add(option);
		 }
	     
	     
	     //to read the option from set
	     
	     for (String option:ts) 
	      {
	    	 Thread.sleep(2000);
	    	 System.out.println(option);
	      }
	     
	     

}
}
