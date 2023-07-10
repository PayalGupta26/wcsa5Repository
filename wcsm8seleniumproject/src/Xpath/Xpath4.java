package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Xpath4 {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//
//		ChromeOptions co = new	ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Thread.sleep(2000);

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[text()='✕']")).click();//handle login pop up


		driver.findElement(By.name("q")).sendKeys("hp laptop");//search text box and passing args
     
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//magnifying glass
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]"));//processor select
		
		

	}

}
