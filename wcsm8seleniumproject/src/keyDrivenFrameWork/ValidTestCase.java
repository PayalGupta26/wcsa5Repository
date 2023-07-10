package keyDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidTestCase extends BestTest{//to achieve upcasting i.e. webdriver driver hence w can used findElement
	
	
	public static void main(String[] args) throws IOException {
		
		BestTest bt=new BestTest();
		bt.openBrowser();
		
		
		Flib flib=new Flib();
		
		
		
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH, "Username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH, "Password"));
		driver.findElement(By.id("loginButton")).click();
		
	}

}
