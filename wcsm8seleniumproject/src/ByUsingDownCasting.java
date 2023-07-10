import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByUsingDownCasting {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/downloads/");
		
		RemoteWebDriver rwd=(RemoteWebDriver)driver;
		
		File src = rwd.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./ScreenShot2/ss2.png");
		
		Files.copy(src, dest);
	}

}
