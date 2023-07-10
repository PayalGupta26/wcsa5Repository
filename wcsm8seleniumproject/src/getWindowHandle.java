import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		//Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobile");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
        
		//click on 1st option
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']/../../../..//span[text()='14,990']")).click();
		
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(4000);
		//click on color
       WebElement colorElement = driver.findElement(By.xpath("//img[@alt='Icy Silver']"));
       
       Point loc = colorElement.getLocation();
       int xaxis = loc.getX();
       int yaxis = loc.getY();
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")" );

       
     //  jse.executeScript("argument[0].click();",colorElement);
        
        //click on 4g
     //   driver.findElement(By.xpath("//p[text()='4GB + 128GB']")).click();
//		Point target = element.getLocation();
//		int xaxis = target.getX();
//		int yaxis = target.getY();
//		
//		jse.executeScript("window.scrollBy(+xaxis+ " ,"+ yaxis+)");
	
		
	}

}
