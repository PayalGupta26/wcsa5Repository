package keyDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidTestCase extends BestTest{
	
	public static void main(String[] args) throws IOException {
		
		BestTest bt=new BestTest();
		bt.openBrowser();
		
		Flib flib=new Flib();
		
		int rc = flib.getLastRowNum(EXCEL_PATH, "InvalidCreds");
		
		for (int i =1 ; i <=rc; i++) {
			
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData(PROP_PATH, EXCEL_PATH, i, rc));
			driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH, "Password"));
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.name("username")).clear();
			
		}
		
		
	}

}
