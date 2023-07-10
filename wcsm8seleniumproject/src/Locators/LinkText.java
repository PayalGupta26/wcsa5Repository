package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver  = new ChromeDriver(co);

		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/link.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("FlipcartLink"));
		driver.close();




	}

}
