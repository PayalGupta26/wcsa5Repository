package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeSyncronization {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//by applying implicit wait-->> we can handled the synchronization problem
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	
		driver.get("http://desktop-51heeif/login.do");
		
		String loginpageTitle = driver.getTitle();
		
		//to handle login page-->. we campare the actual title with the expected title
		if (loginpageTitle.equals("actiTIME - Login"))
		{  
			System.out.println("test case is pass");
			driver.findElement(By.name("username")).sendKeys("admin");
			
			driver.findElement(By.name("pwd")).sendKeys("manager");

			
			driver.findElement(By.id("loginButton")).click();
			
		} 
		else
		{
			System.out.println("we will get an exception");
   		}
		
		//to handle home page
		String homepagetitle = driver.getTitle();
		
		//by aapliying the explicit wait so no need to used the if -else block 
		//if cond not satisfied it wont execute next set of lines
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains(homepagetitle));//verifying title of the homepage
		
//		if (homepagetitle.equals("actiTIME - Enter Time-Track"))
//		{
			System.out.println("test case is pass");
			driver.findElement(By.linkText("Logout")).click();
//			
//		}
//		
//		else
//		{
//			System.out.println("we will get an exception");
//		}
	}
	
	//created generic reusability method for explicit wait -->> 
	public static void explicitWait(WebDriver driver,int sec,String title)
	{
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		 wait.until(ExpectedConditions.titleContains(title));
	}

}
