package ActionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {//to right click on the webelement
	
	public static void main(String[] args) throws InterruptedException {
		
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/singalDropdown.html");
		   WebElement target = driver.findElement(By.id("i1"));
		   
		   Actions act=new Actions(driver);
		   Thread.sleep(2000);
		   act.contextClick(target).perform();
		   
		   
		   
	}

}
