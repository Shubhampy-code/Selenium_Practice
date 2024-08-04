package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstop.com/");
		
		// step 1 -->create object of action class
		
		Actions act = new Actions(driver);
		
		// Step 2 - locaotr for webelement where i want to mouseover
		
		WebElement watches_link = driver.findElement(By.linkText("WATCHES"));
		
		// Step 3 - use the movetoelement()
		
		act.moveToElement(watches_link).build().perform();
	}

}
