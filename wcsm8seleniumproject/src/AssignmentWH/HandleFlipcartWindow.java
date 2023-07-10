package AssignmentWH;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFlipcartWindow {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.flipkart.com/");
		
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	driver.findElement(By.name("q")).sendKeys("samsung s23 ultra");
	
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	   //to handle the parent
     	String parentHandle = driver.getWindowHandle();
     	
     	//habdle of parent and child
     	
     	Set<String> allHandle = driver.getWindowHandles();
     	
     	for (String wh : allHandle) {
     		
     		if (!parentHandle.equals(wh)) {
     			
     			
				
			}
			
		}
     	
     	
		
		
	}

}
