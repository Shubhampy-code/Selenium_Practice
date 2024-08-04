package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Assert the title - using hard assert
		
		String expectedTitle = "Practice Page";
		String actualTitle = driver.getTitle();
		
		org.testng.Assert.assertEquals(actualTitle, expectedTitle);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://rahulshettyacademy.com/AutomationPractice/");
		
		String URLStr = driver.getCurrentUrl(); 
		
		boolean status = URLStr.contains("AutomationPractice");
		
		Assert.assertTrue(status);
				
	}
	
	@Test
	public void test1() {
		WebElement check1 = driver.findElement(By.id("checkBoxOption1"));
		Assert.assertTrue(check1.isDisplayed());
		check1.click();
		Assert.assertTrue(check1.isSelected());
		
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		
		String actualemail = driver.findElement(By.cssSelector(".top-left")).getText();
		Assert.assertEquals(actualemail, "contact@rahulshettyacademy.com");
		
		
	}
	
	@Test
	public void test2() {
		
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		
		SoftAssert as = new SoftAssert();
		as.assertEquals(driver.getTitle(), "RS Academy");
		
		driver.findElement(By.linkText("JOIN NOW")).click();
		
	}
	
	
	@AfterMethod(alwaysRun =  true)
	public void teardown() {
		driver.close();
	}

}
