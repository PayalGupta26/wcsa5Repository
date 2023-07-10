package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPageSource {

	public static void main(String[] args) {

	//	System.setProperty("webdriver.chrome.driver", "./driver.chromedriver.exe");


		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver	driver=new ChromeDriver(co);

		driver.get("https://www.instagram.com/");

		String scode = driver.getPageSource();
	//	System.out.println(scode);
		
		System.out.println(driver.getPageSource());

		driver.close();

	}

}
