package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandledAlertPopUp {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/alert.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try It']")).click();

		
	   Robot robot = new Robot();
		
		Thread.sleep(4000);
		Alert al = driver.switchTo().alert();
	//	al.accept();
	//	al.dismiss();
       System.out.println(al.getText());		
	}

}
