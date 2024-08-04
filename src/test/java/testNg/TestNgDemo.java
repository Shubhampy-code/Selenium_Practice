package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo {
	
	WebDriver driver;
	
	//Before series to write pre-confitions/ pre-requisites, that is the code before actual
	
	//BeforeMethod --> before method executed before each @test
	//afterMethod--> will execute after each @test
	
	// smoke
	// Regression
	// sanity
	
	
	@BeforeMethod(alwaysRun = true)
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
		
	//Test caase
	@Test(priority = 0,groups = "smoke")
	public void SearchGamingLaptop() {
		
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("gaming laptop");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();
		
		driver.findElement(By.xpath("(//span[@class=\"cbx x-refine__multi-select-cbx\"])[1]")).click();
	}
	
	@Test(priority = 0,groups = "smoke")
	public void SearchLaptop() {
		
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("laptop");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();
		
		//driver.findElement(By.xpath("(//span[@class=\"cbx x-refine__multi-select-cbx\"])[1]")).click();
	}

	
	@Test(priority = 2,groups = "Sanity")
	public void Searchiphone() {
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();

		
	}
	

	@Test(priority = 2,groups = "Sanity")
	public void Searchmobilephone() {
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("mobile phone");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();

		
	}

	
	@Test(priority = 1,groups = "Regression")
	public void SearchTshirts() {
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("Tshirt");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();

	}
	
	@Test(priority = 1,groups = "Regression")
	public void SearchTshirtspuma() {
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("Tshirt");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();

	}
	
	@AfterMethod(alwaysRun = true)
	public void teardown() {
		driver.close();
	}
	
	
}
