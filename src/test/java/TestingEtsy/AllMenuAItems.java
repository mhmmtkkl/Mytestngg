package TestingEtsy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Class2testNG.myBeforeClass;
import Utilities.ReusableMethods;

public class AllMenuAItems extends myBeforeClass{

	private WebDriver driver;
	 
	ReusableMethods r1 = new ReusableMethods();
	
	@Test
	public void Allhoveroveronbuttons() {
 
		
		
		int menuItemSize = driver.findElements(By.xpath("//span[@class='text-gray-darker']")).size();
		
		for (int i = 1; i <= menuItemSize ; i++) {
			
		driver.findElement(By.xpath("//div[@id='etsy-logo']//a")).click();
			
		WebElement element1 = driver.findElement(By.xpath("(//span[@class='text-gray-darker'])["+i+"]"));
			
//			for (int j = 0; j < array.length; j++) {
//				
//			}
		}
		
		
	}
	
}
