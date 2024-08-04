package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo2 {
	
WebDriver driver;
	
	//Before series to write pre-confitions/ pre-requisites, that is the code before actual
	// Before Test - All the @test will execute 

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
		
	//Test caase
	@Test(priority = 0)
	public void SearchTest() {
		
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("gaming laptop");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();
		
		//driver.findElement(By.xpath("(//span[@class=\"cbx x-refine__multi-select-cbx\"])[1]")).click();
	}
	
	@Test(dependsOnMethods = "SearchTest",priority = 1)
	public void CheckBox() {
		driver.findElement(By.xpath("(//span[@class=\"cbx x-refine__multi-select-cbx\"])[1]")).click();
	}
	
	@Test(priority = 1)
	public void Searchiphone() {
		
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).clear();

		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();

		
	}
	
	@Test(priority = 2)
	public void SearchTshirts() {
		
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).clear();

		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("Tshirt");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();

	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	

}
