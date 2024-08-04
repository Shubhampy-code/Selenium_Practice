package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousoverEbay {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		Actions act = new Actions(driver);
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		act.moveToElement(electronics).build().perform();
		
		Thread.sleep(2000);
		WebElement Fashion = driver.findElement(By.linkText("Fashion"));
		act.moveToElement(Fashion).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Refurbished")).click();
		
		

	}

}
