package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReusableMethods {
	
	private WebDriver driver;
	
	
	public void SearchFunctionality(String myinput) {
		
		driver=myDriver.getDriver("Chrome");
		
		WebElement SearchingInput=  driver.findElement(By.xpath("//input[contains(@id,'search')]"));
		
		SearchingInput.sendKeys(myinput);
		
		WebElement SearchingClick = driver.findElement(By.xpath("//button[@type='submit']"));
		
		SearchingClick.click();
		
		  
		
	}

}
