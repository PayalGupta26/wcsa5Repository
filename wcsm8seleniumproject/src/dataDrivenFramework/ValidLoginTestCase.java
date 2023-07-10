package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-51heeif/login.do");

       //to read data from excel sheet 
		
		Flib fb=new Flib();//create obj of flib class
		
		//calling method of the flib class i.e. readDataFromeExcel
		
		//read valid cred foe username
		String validusn= fb.readDataFromeExcel("./data/ActiTime.xlsx", "validCreds", 1, 0);
        
	    //read valid cred for password
        String validpsw = fb.readDataFromeExcel("./data/ActiTime.xlsx", "validCreds", 1, 1);

		driver.findElement(By.name("username")).sendKeys(validusn);

		driver.findElement(By.name("pwd")).sendKeys(validpsw);

		driver.findElement(By.id("loginButton")).click();


	}

}
