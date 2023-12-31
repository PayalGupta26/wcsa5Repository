package ActionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class doubleClick {
	
	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("http://desktop-51heeif/login.do");
		   
		   new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));

		   driver.findElement(By.name("username")).sendKeys("admin");
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   
		   driver.findElement(By.xpath("//a[text()='Login']")).click();
		   
		   //to click on settings
		   driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img[@class='sizer']")).click();
		   
		   //to click on logo and color
		   driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		   
		   //to click on the custom logo
		   driver.findElement(By.id("uploadNewLogoOption")).click();
		   
		   
		   //click on button to select the file
		  WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		   
		  Actions act= new Actions(driver);
		   act.doubleClick(target).perform();
		   
		   
		   
		   
		   
	}

}
