package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPArticularElement {
	
	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();//upcasting to webdriver
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/DisableWebElement.html");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		//to pass the input to the disable webelement by using javascriptExecutor
		jse.executeScript("document.getElementById('i1').value='tanmay'");
	}

}
