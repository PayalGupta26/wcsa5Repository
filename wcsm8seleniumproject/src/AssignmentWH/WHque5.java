package AssignmentWH;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WHque5 {//how to maimize child browser
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("http://omayo.blogspot.com/");
		
		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		    Point point = link.getLocation();
		    int xaxis = point.getX();
		    int yaxis = point.getY();
		    
		    jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
		    Thread.sleep(2000);
		    
		    link.click();
		    
		    //add of parent handle
		    
		    
		    String parenHandle = driver.getWindowHandle();
		    
		    Set<String> allHandle = driver.getWindowHandles();
		    
		    for (String wh : allHandle) {
		    	
		    	if (!parenHandle.equals(wh)) {
		    		
		    		driver.switchTo().window(wh);
		    		driver.manage().window().maximize();
		    		
		    		}
		    	
				
			}
		
		
	}

}
