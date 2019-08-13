package TestingEtsy;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Class2testNG.myBeforeClass;
import Utilities.ReusableMethods;
import Utilities.myDriver;

public class AllMenuAItems extends myBeforeClass{

	private WebDriver driver;
	 
	ReusableMethods r1 = new ReusableMethods();
	
	@Test
	public void Allhoveroveronbuttons() throws InterruptedException {
// 
//		Thread.sleep(5000);
		
		  driver = myDriver.getDriver("Chrome");
		  
		int menuItemSize = driver.findElements(By.xpath("//span[@class='text-gray-darker']/parent::a/parent::li")).size();
		
		for (int i = 1; i <= menuItemSize ; i++) {
			
			Actions action = new Actions(driver);
			
			WebElement element1 = driver.findElement(By.xpath("(//span[@class='text-gray-darker'])["+i+"]"));
			
//			hover over main dropdown
			action.moveToElement(element1).perform();
			
			int secondmenuItemCount = driver.findElements(By.xpath("//div[@aria-hidden='false']//li[@data-ui='side-nav-category-link']")).size();
			
		
			
			for (int j =1; j <= secondmenuItemCount-1; j++) {
				
				element1 = driver.findElement(By.xpath("(//span[@class='text-gray-darker'])["+i+"]"));
				  
//				hover over main dropdown
				action.moveToElement(element1).perform();
				
				WebElement secondDropdowns = driver.findElement(By.xpath("(//div[@aria-hidden='false']//li[@data-ui='side-nav-category-link'])["+j+"]"));
				
				action.moveToElement(secondDropdowns).perform();
				
				int thirdDropdownsize = driver.findElements(By.xpath("//section[@aria-hidden='false']//a[contains(@class,'display-block')]")).size();
				
				
				for (int k =1; k <= thirdDropdownsize-1; k++) {
				
					element1 = driver.findElement(By.xpath("(//span[@class='text-gray-darker'])["+i+"]"));
					  
//					hover over main dropdown
					action.moveToElement(element1).perform();
		  
					secondDropdowns = driver.findElement(By.xpath("(//div[@aria-hidden='false']//li[@data-ui='side-nav-category-link'])["+j+"]"));
					
					action.moveToElement(secondDropdowns).perform();
					
					String dropdown3_text = driver.findElement(By.xpath("(//section[@aria-hidden='false']//a[contains(@class,'display-block')])["+k+"]")).getText();
					
					String[] s1 = dropdown3_text.split(" ");
					
					System.out.println(s1[0]);
					
					driver.findElement(By.xpath("(//section[@aria-hidden='false']//a[contains(@class,'display-block')])["+k+"]")).click();
					
					String URL = driver.getCurrentUrl();
					
					assertTrue(URL.contains(s1[0].toLowerCase()));
					
					driver.findElement(By.xpath("//div[@id='etsy-logo']//a")).click();
					
				}
 
			}
		
		}
		
		
	}
	
}
