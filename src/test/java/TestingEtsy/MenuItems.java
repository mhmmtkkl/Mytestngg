package TestingEtsy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Class2testNG.myBeforeClass;
import Utilities.ReusableMethods;
import Utilities.myDriver;

public class MenuItems extends myBeforeClass{

	private WebDriver driver;
	 
	ReusableMethods r1 = new ReusableMethods();
		
	@Test
		public void hoveroveronbuttons() {
			
			  driver = myDriver.getDriver("Chrome");
			
			  WebDriverWait wait = new WebDriverWait(driver, 20);
			 
			  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'Home & Living')]")));
			 
			  WebElement homeLiving = driver.findElement(By.xpath("//span[contains(text(),'Home & Living')]"));
			 
			  WebElement Pet_Suplies = driver.findElement(By.xpath("//span[contains(text(),'Pet Supplies')]"));
				 
			  WebElement PetClothing = driver.findElement(By.xpath("//a[contains(text(),'Pet Clothing & Shoes')]"));
				 
			  r1.hoveroverinHomePage(homeLiving, Pet_Suplies, PetClothing);
			
			  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='etsy-logo']//a")));
	}
	
	
}
