package getScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByExplicitTYpeCasting {//
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		
		//explicit type casting 
		TakesScreenshot ts=(TakesScreenshot)driver;
		 
		//Implementation of method
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		//create object for the file class asking one argument i.e 
		File dest=new File("./ScreenShots/ss1.png");
		
		Files.copy(src, dest);
			
		
		
		
	}

}