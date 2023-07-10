package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/confirmation.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		//handled confirmation popup by using switch to method
		
		Thread.sleep(2000);

		Alert al = driver.switchTo().alert();
		//al.accept();
		System.out.println(al.getText());
		al.dismiss();


	}

}
