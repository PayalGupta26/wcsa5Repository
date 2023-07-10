package getScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByUpcastingIntoRWD {
	
	public static void main(String[] args) throws IOException {//file class throwing one exception Thus we declaring the Exception
		
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/downloads/");
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./ScreenShot2/Selenium.png");//create obj of file Class -->>asking for one args-->>
		                                                 //String path of ss where we r storing
		
		Files.copy(src, dest);//3rd party class to call both src and dest -->>
	}

}
