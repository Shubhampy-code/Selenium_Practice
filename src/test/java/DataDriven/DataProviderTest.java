package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	// I want to test my test with multiple sets of data.
	// I want to execute each test data in a new browser.
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new  ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
	}

	
	@Test(dataProvider = "data")
	public void herokuLogin(String Username, String password) {
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.cssSelector(".radius")).click();
		
	}
	
	//Data provider through 2D array
	
	@DataProvider(name = "data")
	public Object[][] data() {
		return new Object[][] {
			
		new Object[] {"tom","super"},
		new Object[] {"smith","Secret"},
		new Object[] {"tomsmith","SUperSecretPasswordt"},
		new Object[] {"tomsmith",""},
		new Object[] {"tomsmith","SuperSecretPassword!"}
		
		};
		
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
