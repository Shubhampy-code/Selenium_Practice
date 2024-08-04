package Report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@Test
public class ExtendReportsDemo {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	
	@BeforeClass
	public void reportconfig() {
		//Step1 -- create object of extentreports class and starting the test.
		
		report = new ExtentReports("C:\\Users\\Shubham Shrivastava\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Selenium_maven_project\\report.html");
		test = report.startTest("Ebay Testing");
		
		
	}
	
	
	@BeforeMethod(alwaysRun = true)
	public void setup() {
		driver = new ChromeDriver();
		
		test.log(LogStatus.PASS,"Chrome browser is opened");
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
		
	//Test caase
	public void SearchGamingLaptop() {
		
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("gaming laptop");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();
		
		//adding custom log message for pass and fail conditions
		if(driver.getCurrentUrl().contains("tshirt")) {
			test.log(LogStatus.PASS,"Serch for gaming laptop");
		}else {
			test.log(LogStatus.FAIL, "Search failed");
		}
		
		
		//driver.findElement(By.xpath("(//span[@class=\"cbx x-refine__multi-select-cbx\"])[1]")).click();
	}
	
	public void SearchLaptop() {
		
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("laptop");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();
		test.log(LogStatus.PASS,"Serch for laptop");
		//driver.findElement(By.xpath("(//span[@class=\"cbx x-refine__multi-select-cbx\"])[1]")).click();
	}

	
	public void Searchiphone() {
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();
		test.log(LogStatus.PASS,"Serch for iphone");
		
	}
	

	public void Searchmobilephone() {
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("mobile phone");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();
		test.log(LogStatus.PASS,"Serch for iphone");
		
	}

	
	@AfterMethod(alwaysRun = true)
	public void teardown() {
		driver.close();
		test.log(LogStatus.PASS,"Browser closed");
	}
	
	@AfterClass
	public void flush() {
		report.flush();
		report.endTest(test);
	}
	

}
