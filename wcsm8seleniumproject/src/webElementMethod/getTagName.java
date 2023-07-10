package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class getTagName {
	
	public static void main(String[] args) {
		
		System.setProperty("webdrivre.edge.driver", "./drivers/msedgedriver.exe");
	      WebDriver	driver=new EdgeDriver();
	      driver.manage().window().maximize();
	      
	      
	      driver.get("https://www.selenium.dev/");
	      WebElement element = driver.findElement(By.xpath("//h2[text()='News']"));
	      String tagname = element.getTagName();
	      System.out.println(tagname);
	      
	}

}
