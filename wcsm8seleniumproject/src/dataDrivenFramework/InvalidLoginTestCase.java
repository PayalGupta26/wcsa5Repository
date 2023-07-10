package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-51heeif/login.do");
		
		Flib fb=new Flib();
		
		int rc = fb.getLastRowCount("./data/ActiTime.xlsx", "InvalidCreds");
        for(int i=1;i<=rc;i++) 
        {
		String InvalidUsnTB = fb.readDataFromeExcel("./data/ActiTime.xlsx", "InvalidCreds", i , 0);
		String InvalidPwdTB = fb.readDataFromeExcel("./data/ActiTime.xlsx", "InvalidCreds", i , 1);

		driver.findElement(By.name("username")).sendKeys(InvalidUsnTB);

		driver.findElement(By.name("pwd")).sendKeys(InvalidPwdTB);

		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.name("username")).clear();
        }
	
	}

}
