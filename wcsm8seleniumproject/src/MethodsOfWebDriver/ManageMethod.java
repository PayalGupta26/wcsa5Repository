package MethodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManageMethod {
	
	
	public static void main(String[] args) throws InterruptedException {
		//path of the driver executable file are not set get IllegalStateEception
	//	System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
		
	    ChromeOptions co = new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	
        WebDriver   driver	=new ChromeDriver(co);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        //set the size of the browser
        Dimension targetSize=new Dimension(450,550);//object creation for dimention clss
        driver.manage().window().setSize(targetSize);//parameterized method
        Thread.sleep(2000);
        
        
        //to set the position of the browser 
        Point targetPosition = new Point(650,450);//object create for the point class 
        driver.manage().window().setPosition(targetPosition);
        Thread.sleep(2000);

        
        driver.close();
        
        
        
        
        
          
          
		
	}

}
