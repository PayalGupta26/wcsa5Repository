package getScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SsOfWebElement {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		
		WebElement USN = driver.findElement(By.name("username"));
		
		if (USN.isDisplayed()) {
			
			System.out.println("we can enter username");
			
		}
		
		else {
			
			File src = USN.getScreenshotAs(OutputType.FILE);
			File dest=new File("./ScreenShot2/username.png");
			Files.copy(src, dest);
		}
		
		
	}

}
