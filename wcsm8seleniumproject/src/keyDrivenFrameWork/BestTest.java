package keyDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestTest extends Flib implements IautoConstant{//entends Flib class into the bestTest class to acsses parent clss method
	                                                //implements Iauto interface in which we declare  variables to use through out package
	
	//it is used to open and close the browser
	
	//static global var
	static  WebDriver driver;
	
	
	public void openBrowser() throws IOException
	{
	
		Flib flib=new Flib();
		
		String browserValue = flib.readPropertyData(PROP_PATH, "Browser");
		
		String url = flib.readPropertyData(PROP_PATH,"Url");
		
		if (browserValue.equalsIgnoreCase("chrome")) {
			
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			}
		else if (browserValue.equalsIgnoreCase("firefox")) {
			
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			}
		
		else if (browserValue.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			}
		else {
			System.out.println("enter the valid browser value");
			
		    }
		
		
	}
	
	
	
	//method to close the browser
	public void closeBrowser()
	{
         driver.quit();
	}
}
