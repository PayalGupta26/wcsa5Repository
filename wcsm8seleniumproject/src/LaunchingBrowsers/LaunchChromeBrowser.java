package LaunchingBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser {
	
	
	public static void main(String[] args) {
		
		//to handled IllegelStateException
//		System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		
		//ConectionFailedexception
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		new ChromeDriver();
		
		
		
		
		
		
		
		
		
	}

}
