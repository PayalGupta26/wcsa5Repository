package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagNameLocator {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
	      co.addArguments("--remote-allow-origins=*");
	      
	    WebDriver driver =new ChromeDriver(co);
	    driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/textbox.html");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.tagName("input")).sendKeys("payal26");
	    
	    //--------------------------------------------------------------
	    driver.navigate().to("https://www.instagram.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.tagName("input")).sendKeys("payal26");
	    
	    Thread.sleep(2000);
	    //we cant used tagname to identified more than 1 element 
	    //its a reffer for singal used only
	    driver.findElement(By.tagName("input")).sendKeys("9876543210");
	    
	    
	    
	    
	    
	    
	}

}
