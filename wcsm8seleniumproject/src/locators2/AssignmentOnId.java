package locators2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnId {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.netflix.com/in/Login");
		driver.findElement(By.id("id_userLoginId")).sendKeys("payalgupta@12");
		driver.findElement(By.id("id_password")).sendKeys("9874632154");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}

}
