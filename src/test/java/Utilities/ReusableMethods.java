package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {
	
	private WebDriver driver;
	
	
	public void SearchFunctionality(String myinput) {
		
		driver=myDriver.getDriver("Chrome");
		
		WebElement SearchingInput=  driver.findElement(By.xpath("//input[contains(@id,'search')]"));
		
		SearchingInput.sendKeys(myinput);
		
		WebElement SearchingClick = driver.findElement(By.xpath("//button[@type='submit']"));
		
		SearchingClick.click();
	}
	
	public void hoveroverinHomePage(WebElement element1 , WebElement element2 ,WebElement element3) {
		
		driver = myDriver.getDriver("Chrome");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element1).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		 
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'Pet Supplies')]")));
		  
		action.moveToElement(element2).perform();
		
		element3.click();
		
	}
	

}
