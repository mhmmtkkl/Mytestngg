package Class2testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
 
import org.testng.annotations.BeforeTest;

import Utilities.myDriver;
 

public abstract class myBeforeClass {

	private WebDriver driver;
	
	@BeforeTest
	public void mybeforeTest() {
	 	 
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
			 
		driver = myDriver.getDriver("Chrome");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.etsy.com/");
	 
		driver.manage().window().maximize();
		
		
 		
	}
}
