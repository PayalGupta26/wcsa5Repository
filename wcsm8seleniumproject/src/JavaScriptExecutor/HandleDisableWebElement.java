package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebElement {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/DisableWebElement.html");
     	Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
	    Thread.sleep(2000);

		
     	jse.executeScript("document.getElementById('i1').value='manager'");
		
	}

}
