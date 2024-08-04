package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayDynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.cssSelector("[placeholder='Search for anything']")).sendKeys("nike");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector(".ghAC_sugg"));
		
		for (WebElement opt : options) {
			Thread.sleep(2000);
			if(opt.getText().equals("nike air max")) {
				opt.click();
				
				
			}
			
		}
		

	}

}
