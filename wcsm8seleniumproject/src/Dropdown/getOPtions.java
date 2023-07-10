package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOPtions {
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/multiselect%20dropdown.html");

		WebElement Multidropdown = driver.findElement(By.name("menu"));
		Select Sel=new Select(Multidropdown);
		
		List<WebElement> options = Sel.getOptions();//since it is a list we need for loop
		
		//get options using for loop
//		for (int i = 0; i < options.size(); i++) {//used size method -->>to know how much element is there
//			String eachOption = options.get(i).getText();//method chaining-->>1st get index an then get the text of that index
//			System.out.println(eachOption);
//			Thread.sleep(1000);
//		}
		
		
		//by using for each loop
		for (WebElement op : options) {
			
			String textOFOP = op.getText();
			System.out.println(textOFOP);
			
		}
		
	}

}
