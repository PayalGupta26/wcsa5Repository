package methodofWebdriver2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manageMethod {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//to set the size of browser
		Dimension target = new Dimension(250,500);
		driver.manage().window().setSize(target);
		
		
		//to set the position of the browser
		Point option = new Point(300,400);
		driver.manage().window().setPosition(option);
		
		
	//	to maximize the bowser
		driver.manage().window().maximize();
	}

}
