package PopUp;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUP {
	
	public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
		System.out.println("enter the browser");

		String browservalue = sc.next();//nextmethod coz asking string input
		
	    ChromeOptions co = new	ChromeOptions();
	    co.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.easemytrip.com/");

	}

}
