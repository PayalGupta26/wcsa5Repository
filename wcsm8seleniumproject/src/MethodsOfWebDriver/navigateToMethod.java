package MethodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateToMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		//   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.navigate().to("https://www.google.com/");
		   driver.navigate().back();
		   Thread.sleep(2000);
		   
		   driver.navigate().forward();
		   Thread.sleep(2000);
		   
		   driver.navigate().refresh();
		   

		   
		   
		
	}

}
