package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorActiTime {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        
		driver.get("http://desktop-51heeif/login.do");

		driver.findElement(By.cssSelector("input[name^='u']")).sendKeys("admin");

		driver.findElement(By.cssSelector("input[name^='pw']")).sendKeys("manager");

		driver.findElement(By.cssSelector("a[id$='Button']")).click();

		Thread.sleep(30);

		driver.navigate().to("http://desktop-51heeif/administration/userlist.do");

		driver.findElement(By.cssSelector("input[value^='Cr']")).click();

		Thread.sleep(30);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("payal");
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("payal@123");
		driver.findElement(By.);
		




		//       WebElement pwd = driver.findElement(By.cssSelector("passwordText"));
		//       pwd.sendKeys("payal123");

		//   Thread.sleep(2000);

		//   driver.findElement(By.className("input[name*='firstName']")).sendKeys("payal");

		//   driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("gupta");

		//       WebElement repwd = driver.findElement(By.cssSelector("input[name*='passwordTextR']"));
		//       repwd.sendKeys("payal123");

		//       if (pwd.equals(repwd)) {
		//    	   
		//    	   System.out.println("password match");
		//    	  }
		//       else {
		//    	   
		//    	   System.out.println("password and retype password its not matching");
		//		
		//	}






	}

}
