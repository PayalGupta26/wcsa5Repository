package Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("http://desktop-51heeif/login.do");
		   //login to actitime
		   driver.findElement(By.name("username")).sendKeys("admin");
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   driver.findElement(By.id("loginButton")).click();
		   
		  // to click on settings
		   driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		   
		   //to click on logo &color
		   driver.findElement(By.xpath("//a[contains(text(),'Logo &')]")).click();
		   
		  // click on radio button
		   
		   driver.findElement(By.id("uploadNewLogoOption")).click();
		   
		   WebElement uploadelement = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		   Actions act=new Actions(driver);
		   Thread.sleep(2000);
		   act.doubleClick(uploadelement).perform();

		   File file =new File("./autoItPrograms/OmayoFileUpload2.exe");
		   String abspath = file.getAbsolutePath();
		   
		   Runtime.getRuntime().exec(abspath);
		   Thread.sleep(4000);

		   Runtime.getRuntime().exec(abspath);


		   
		   
		 
		   
		   
		   
	}

}
