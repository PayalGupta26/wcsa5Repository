package LaunchingBrowsers;

import java.util.Scanner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RTP {

	public static void main(String[] args) throws InterruptedException {
		//to take input from user we used scanner class
		Scanner s = new Scanner(System.in);//from input stream
		System.out.println("enter the browser u want");
		String  BrowserValue = s.next();//to next take string input  


		if (BrowserValue.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			ChromeOptions co = new	ChromeOptions();
			co.addArguments("--remote-allow-originns=*");

			WebDriver driver =new ChromeDriver(co);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}

		else if(BrowserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers.geckodriver.exe");

			WebDriver	driver=new FirefoxDriver();

			driver.manage().window().maximize();
			driver.close();
		}

		else if(BrowserValue.equalsIgnoreCase("edge"))
		{

			WebDriver	driver=new EdgeDriver();
		}

		else
		{
			System.out.println("enter valid browser value");
		}

	}

}
