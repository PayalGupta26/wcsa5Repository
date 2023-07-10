package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOptions {//it will return all selected options

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Lenovo/Desktop/htmlTags/multiselect%20dropdown.html");
		
		WebElement dropdown = driver.findElement(By.id("i1"));
		
		Select sel=new Select(dropdown);
		
		//select op from the multiDD
		for (int i = 0; i <= 5; i++) {
			
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		//to read all selected options
		List<WebElement> Alloptions = sel.getAllSelectedOptions();//storing all options into the all options var-->.return type--list<webelement>
		
		
		//to read list of web element stored in alloptions used for each loop
//		for (WebElement we: Alloptions) {
//			
//			Thread.sleep(1000);
//
//			String op = we.getText();
//			System.out.println(op);
//			
//				}
		
		
		//to read(print) list of web element stored in alloptions used for loop

        for (int i = 0; i <Alloptions.size(); i++) {// size method from the list-->>gives the size of the list
			
			Thread.sleep(1000);
			
			String ops = Alloptions.get(i).getText();//1st getting index at which element present then get the text of that index
			
			System.out.println(ops);
		}
		
		
		
		
			
		}
	}

