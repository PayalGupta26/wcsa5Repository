
package Xpath2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {//login page
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.get("https://www.spicejet.com/");
		
		//login button of home page
		//to click on login link on the home page
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		//to enter mobile no
        driver.findElement(By.xpath("//input[@type='number' and (@data-testid='user-mobileno-input-box')]")).sendKeys("9876543215");
        
        //to enter password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("payal123");
		Thread.sleep(2000);
		
		//to click on the login button
		driver.findElement(By.xpath("//div[@data-testid='login-cta' and  (contains(@class,'css-'))]")).click();
		
	//	driver.findElement(By.xpath("//div[@data-testid='login-cta' and  (@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73')]")).click();
		
	//	driver.findElement(By.xpath("//div[@data-testid='login-cta' and  (contains(@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73'))]")).click();

	}

}
