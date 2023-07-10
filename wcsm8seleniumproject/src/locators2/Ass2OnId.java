package locators2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass2OnId {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.zomato.com/india");
		Thread.sleep(2000);
		
		//to click on sign up link
		driver.findElement(By.linkText("Sign up")).click();
		//driver.findElement(By.xpath("//a[text()='Sign up']")).click();
      	Thread.sleep(4000);
      	
      	//to enter input into fullname
      	driver.findElement(By.cssSelector("input[class^='sc-1yzxt5f-9 d']")).sendKeys("payal gupta");
      	
      	//to enter input into email textbox
	//    driver.findElement(By.)).sendKeys("guptapayal742@gmail.com");

	}

}
