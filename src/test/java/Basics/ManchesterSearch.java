package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManchesterSearch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("manchester united jersey");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();
		
		//click on all listing radio button

		driver.findElement(By.cssSelector("[data-value='All Listings']")).click();
		
		driver.findElement(By.cssSelector("[data-value='US Only']")).click();
	}

}
