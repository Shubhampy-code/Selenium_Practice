package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EbaySearch {
	
	
	@Test
	public void SearchTest(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("gaming laptop");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();
		
		driver.findElement(By.xpath("(//span[@class=\"cbx x-refine__multi-select-cbx\"])[1]")).click();


	}

}