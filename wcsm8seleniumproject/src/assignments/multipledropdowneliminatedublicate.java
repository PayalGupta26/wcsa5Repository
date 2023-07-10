package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipledropdowneliminatedublicate {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     driver.get("");
	     WebElement dropdown = driver.findElement(By.name("menu"));
	     
	     //to handle dropdoen create obj of select class
	     
	     Select sel=new Select(dropdown);
	     
	     //to get all options from dropdown
	}

}
