package locators2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/link.html");
		//		driver.findElement(By.linkText("FlipcartLink")).click();

		driver.get("http://omayo.blogspot.com/");
		///by using link text
		//driver.findElement(By.linkText("Open a popup window")).click();

		//by using partial link text
		driver.findElement(By.partialLinkText("Open")).click();



	}

}
