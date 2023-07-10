package LaunchingBrowsers;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RTP2 {
	
	    static WebDriver driver;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the browser u want to open");
		String browservalue = sc.next();
		
		
		if (browservalue.equalsIgnoreCase("chrome")) {
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			
		}
		
		else if (browservalue.equalsIgnoreCase("firefox")) {
			
			 driver = new FirefoxDriver();
			driver.manage().window().maximize();

		} 
		
        else if (browservalue.equalsIgnoreCase("edge")) {
			
			 driver = new EdgeDriver();
			driver.manage().window().maximize();

		} 
		
        else {
			
        	System.out.println("enter valid input");
		}
		
		
	}

}
