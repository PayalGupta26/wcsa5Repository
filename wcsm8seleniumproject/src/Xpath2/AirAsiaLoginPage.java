package Xpath2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirAsiaLoginPage {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/oauth2/v2.0/authorize?client_id=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc&redirect_uri=https://api-loyalty.airindia.in/v1/security/authorization/openidconnect/authorize/delegated-token&response_type=code&state=TWt3bDVHVWJFMlkyMC5mTXY4QnIzei4wNldCV2tWb255RGpnenJSeXZiUVVs_en-GB_false_&nonce=TWt3bDVHVWJFMlkyMC5mTXY4QnIzei4wNldCV2tWb255RGpnenJSeXZiUVVs&scope=openid%20offline_access%20profile%20phone%20email&p=B2C_1A_SIGNUP_SIGNIN&prompt=login&display=page&code_challenge_method=S256&code_challenge=njAkYjygRDsNWQ7o676Dy1_YU_EMcZJwY39dwywWD0s&ui_locales=en-GB");
		
		driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("payal@123");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("payal123");
		driver.findElement(By.id("next")).click();
	}

}
