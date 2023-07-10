package ScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay2 {
	
	public static void main(String[] args) throws IOException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		
	//	downcast into the remoteWebDriver
		RemoteWebDriver rwd= (RemoteWebDriver)driver;
		
		File src=rwd.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/ss3.jpg");
		
		Files.copy(src, dest);
		
	}

}
