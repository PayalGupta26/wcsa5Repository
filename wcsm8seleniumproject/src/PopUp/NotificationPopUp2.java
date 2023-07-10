package PopUp;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopUp2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the browser");

		String browservalue = sc.next();//nextmethod coz asking string input
		System.out.println("enter the browser");
		   
		if(browservalue.equalsIgnoreCase("chrome")){
		    //handle notification pop up
		    ChromeOptions co = new	ChromeOptions();
		    co.addArguments("--disable-notifications");

			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.easemytrip.com/");
			Thread.sleep(2000);

		}
		
		else if(browservalue.equalsIgnoreCase("edge")){
		    //handle notification pop up
		    EdgeOptions co = new	EdgeOptions();
		    co.addArguments("--disable-notifications");
			Thread.sleep(200);

			WebDriver driver = new EdgeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.easemytrip.com/");
		}
		
		else if(browservalue.equalsIgnoreCase("firefox")){
		    //handle notification pop up
		    FirefoxOptions co = new	FirefoxOptions();
		    co.addArguments("--disable-notifications");
			Thread.sleep(200);
			WebDriver driver = new FirefoxDriver(co);

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.easemytrip.com/");
		}
		
		else
		{
			System.out.println("enter valid browser name");
		}
			
			
			
	}

}
