package assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpath1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions  co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver  driver= new ChromeDriver(co);

		driver.get("https://www.instagram.com/");
		
	//	driver.
		
		
		
		

    }

}
