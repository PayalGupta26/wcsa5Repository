package Assignment2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnRobotAndAction {
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		
		Actions act = new Actions(driver);
		
		//direct called act class method -->>genralise code
	        WebElement target = (driver.findElement(By.xpath("//a[text()='Watch Jewellery ']")));
	        act.moveToElement(target).perform();
		
	driver.findElement(By.xpath("//a[text()='Band']")).click();
		Thread.sleep(4000);
		
//		//click and hold filter by text
		WebElement target1 = driver.findElement(By.xpath("//div[text()='Filter by']"));
	    
		
		//
		for(int i=1;i<=2;i++){
		
		act.doubleClick(target1).perform();
		act.clickAndHold(target1).perform();

		}
		
		
		Thread.sleep(4000);
      	Robot robot = new Robot();
	
//		//copy the filter by 
		robot.keyPress(KeyEvent.VK_CONTROL);	
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		//find search box
		driver.findElement(By.id("search_query_top_elastic_search")).click();
		
//		//pest the filter by
    	robot.keyPress(KeyEvent.VK_CONTROL);	
     	robot.keyPress(KeyEvent.VK_V);
	
     	robot.keyRelease(KeyEvent.VK_CONTROL);		
     	robot.keyPress(KeyEvent.VK_V);
	
		
//		//hit enter button
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
	}

}
