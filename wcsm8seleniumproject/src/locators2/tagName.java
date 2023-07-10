package locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {//we cant used tagname when more than one element is design with the same tagname

	public static void main(String[] args) throws InterruptedException {



		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		//input tag is used to create more tahn one element hence it  cant find locator uniquely
		//	 driver.findElement(By.tagName("input")).sendKeys("hfeyfeuf");

		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.tagName("input"));
		usn.sendKeys("payal@123");

	}



}
