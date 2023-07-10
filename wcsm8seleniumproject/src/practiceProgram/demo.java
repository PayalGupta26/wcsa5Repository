package practiceProgram;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		Dimension target=new Dimension(450, 500);
		driver.manage().window().setSize(target);
		
		Point targetposition=new Point(350,500);
		driver.manage().window().setPosition(targetposition);
		
		driver.manage().window().maximize();

		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(30);
		String title = driver.getTitle();
		System.out.println(title);
		
		String source = driver.getPageSource();
	//	System.out.println(source);
		
		driver.navigate().to("https://www.google.com/");
		
		
		
		
		
	
	}

}
