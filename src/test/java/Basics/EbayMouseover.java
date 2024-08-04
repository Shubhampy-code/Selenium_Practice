package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EbayMouseover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		// step 1 -->create object of action class
		
		Actions act = new Actions(driver);
		
		WebElement Electronics = driver.findElement(By.linkText("Electronics"));
		
		act.moveToElement(Electronics).build().perform();
		
		

	}

}
