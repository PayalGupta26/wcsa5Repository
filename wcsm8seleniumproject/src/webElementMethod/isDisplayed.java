package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.netflix.com/in/Login");
		WebElement userTB = driver.findElement(By.name("userLoginId"));
		WebElement pwdTB = driver.findElement(By.name("password"));
		WebElement loginBTN = driver.findElement(By.xpath("//button[text()='Sign In']"));
		
		if(userTB.isDisplayed())
		{
			userTB.sendKeys("guptapayal742@gmail.com");
		}
		else
		{
			System.out.println("will get exception");
		}
		
		if(pwdTB.isDisplayed())
		{
			pwdTB.sendKeys("payal123gh");
		}
		else
		{
			System.out.println("will get exception");
		}
		
		if(loginBTN.isDisplayed())
		{
			loginBTN.click();
		}
		else
		{
			System.out.println("will get exception");
		}
		
		
		

	}

}
