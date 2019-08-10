package Class2testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.myDriver;

public class testng_810 extends myBeforeClass{

	private WebDriver driver;
	
	
	@Test(priority=2)
	public void ClickEnglishCourse() {
		  
		driver= myDriver.getDriver("Chrome");
				
		Actions action = new Actions(driver);
				
		WebElement element = driver.findElement(By.xpath("//span[text()='Services']"));
		
		action.moveToElement(element).perform();
		
		WebElement EnglishCourse = driver.findElement(By.xpath("//span[text()='English Course']"));
		
		EnglishCourse.click();
		
		
	}
	
	@Test(priority=1)
	public void LearnEnglish() {
		 
		 driver= myDriver.getDriver("Chrome");
		 
		Actions action = new Actions(driver);
				
		WebElement element = driver.findElement(By.xpath("//span[text()='Blog']"));
		
		action.moveToElement(element).perform();
		
		WebElement Learn_English = driver.findElement(By.xpath("//span[text()='Learn English']"));
		
		Learn_English.click();
		 
	  
	}
}
