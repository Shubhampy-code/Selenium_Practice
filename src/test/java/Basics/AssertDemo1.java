package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertDemo1 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationteststore.com/");
		String expectedTitle = "A place to practice your automation skills!";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationteststore.com/");
		
		String URLStr = driver.getCurrentUrl(); 
	}
	
	@Test
	public void test1() throws InterruptedException {
		
		WebElement click1 = driver.findElement(By.linkText("Contact Us"));
		click1.click();
		
		
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle , "Contact Us");
		
		driver.findElement(By.cssSelector("[name=\"first_name\"]")).sendKeys("shubham");
		driver.findElement(By.cssSelector("[id=\"ContactUsFrm_email\"]")).sendKeys("shubham.123@gmail.com");
		driver.findElement(By.cssSelector("[name=\"enquiry\"]")).sendKeys("fgfgfjhfhj");
		driver.findElement(By.cssSelector("[title=\"Submit\"]")).click();
		
		
		String ActualText = driver.findElement(By.xpath("//section[@class=\"mb40\"]/p[2]")).getText();
		Assert.assertEquals(ActualText,"Your enquiry has been successfully sent to the store owner!");
		Thread.sleep(2000);
	}
	
	
	@AfterMethod(alwaysRun =  true)
	public void teardown() {
		driver.close();
	}
	
}