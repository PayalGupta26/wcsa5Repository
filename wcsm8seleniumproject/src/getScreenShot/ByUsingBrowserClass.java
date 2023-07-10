package getScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByUsingBrowserClass {//creating obj of the chromedriver class directly
	
	public static void main(String[] args) throws IOException {
		
		ChromeDriver cddriver=new ChromeDriver();

		cddriver.manage().window().maximize();
		cddriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cddriver.get("https://www.facebook.com/");
		
		
		File src = cddriver.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./ScreenShot2/facebook3.png");
		
		Files.copy(src, dest);
	}

}
