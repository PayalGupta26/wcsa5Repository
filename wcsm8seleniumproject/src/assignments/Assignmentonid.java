package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignmentonid {
	
	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.crome.driver", "./drivers.cromedriver.exe");
		
          	ChromeOptions co = new ChromeOptions();
          	co.addArguments("--remote-allow-origins=*");
          	
        WebDriver  driver	=new ChromeDriver(co);
        
        driver.get("https://www.netflix.com/in/Login");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("id_userLoginId")).sendKeys("guptapayal742@gmail.com");
        driver.findElement(By.id("id_password")).sendKeys("id_password");
      //  driver.findElement(By.xpath(""));
        
        
        
        
	}

}
