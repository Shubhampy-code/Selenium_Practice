package DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	WebDriver driver;
	WebDriver driver1;
	
	@Test
	public void chrometest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bstackdemo.com/");
		
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void firefoxTest() {
		driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.bstackdemo.com/");
		
		System.out.println(driver1.getTitle());
	}
	
	
	@AfterClass
	public void teardown() {
		driver.quit();
		driver1.quit();
	}

}
