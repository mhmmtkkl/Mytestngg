package TestingEtsy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Class2testNG.myBeforeClass;
import Utilities.ReusableMethods;
import Utilities.myDriver;

public class SearchingFunctionality extends myBeforeClass{

	private WebDriver driver;
	
	ReusableMethods r1 = new ReusableMethods();
	
	@Test
	public void basicSearch() {
		
		 driver = myDriver.getDriver("Chrome");
		
		 r1.SearchFunctionality("teddyBear");
		 
		 driver.findElement(By.xpath("//label[text()='Black']")).click();
		 
		 String text_black =  driver.findElement(By.xpath("//div[@class='tag-body text-truncate tag-max-width']")).getText();
		 
		 Assert.assertTrue(text_black.equals("Black"));
		
	}
	 
}
