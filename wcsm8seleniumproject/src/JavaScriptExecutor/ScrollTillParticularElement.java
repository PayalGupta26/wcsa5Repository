package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularElement {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        driver.get("https://www.selenium.dev/");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//h2[text()='News']"));
        Point location = element.getLocation();
        Thread.sleep(2000);

        int xaxis = location.getX();
        int yaxis = location.getY();
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        
        Thread.sleep(2000);

        //by using logic
     //   jse.executeScript("window.scrollBy("+xaxis+ "," +(yaxis-160)+")" );
        
        //by using functionn
        jse.executeScript("arguments[0].scrollIntoView(true)",element);//pass 2 args i.e string and then targetelement
        //we can either pass true or false

        
	}

}
