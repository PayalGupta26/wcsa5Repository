package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement username = driver.findElement(By.name("username"));
		Rectangle rect = username.getRect();
		
		int xaxis = rect.getX();
        int yaxis = rect.getY();
        System.out.println("x axis:"+xaxis+" y axix"+yaxis);
        
        int height = rect.getHeight();
        int width = rect.getWidth();
        System.out.println("height is"+height+ " width is"+width);

        System.out.println();


	}

}
