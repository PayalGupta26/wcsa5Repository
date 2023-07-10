package MethodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
          WebDriver driver	=new ChromeDriver(co);
         
          //to launch web application//parameterize method
          driver.get("https://www.instagram.com/");
         
          //get title of the web page
      //  String loginPageTitle  =driver.getTitle();
     //   System.out.println(loginPageTitle);
          
        
        //to maximize thhe size of the webpage
          driver.manage().window().maximize();
          
          //to set the size of the browser
          Dimension targetSize = new Dimension(550,450);
          Thread.sleep(2000);

           driver.manage().window().setSize(targetSize);
           
           
           //setposition of the browser
           Point targetposition = new Point(250,300);
           Thread.sleep(2000);

           driver.manage().window().setPosition(targetposition);
           
          
          Thread.sleep(2000);
          
          //to close the parent webpage
          driver.close();
          
          
          
		
		
	}

}
