package getScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot1 {//by using TypeCasting // follow selenium std
	
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		
		//type casting from webdriver to TakesScreenShot
		TakesScreenshot	Ts= (TakesScreenshot)driver;
		
		//want ss in file
		File src = Ts.getScreenshotAs(OutputType.FILE);//place where ss store
		
		//ceate the object of the  file class it will ask for the argument -->> path of the file folder where we want to store the ss
		//we need to give the relative path to store the ss in the folder
		
		File dest=new File("./ScreenShot2/ss1.jpg");//(1st) folder path 2)ss name 3) extension)
		
		//3rd party class 
		Files.copy(src, dest) ; //we need to pest the src into the destination
		
		
		
		
		
	}

}
