package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeimplicitwait {
	//actitime time test case
    
	
	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	       WebDriver	driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //it only works for the FE & EES method
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.get("http://desktop-51heeif/login.do");

	      if(driver.getTitle().equalsIgnoreCase("actiTIME - Login "))
	       {
	    	   System.out.println("login page title is matched!1 Test Case Failed");
	    	   driver.findElement(By.name("username"));
	    	   driver.findElement(By.name("pwd"));
	    	   driver.findElement(By.xpath("//a[text()='Login']"));
	    	   
	        }
	       else
	       {
	    	   System.out.println("test case failed");
	       }
	       

	       if(driver.getTitle().equalsIgnoreCase("actiTIME - Login "))
	       {
	    	   
	    	   
	       }
	       else
	       {
	    	   System.out.println("test case failed");
	       }
	       
	       
	}
}
