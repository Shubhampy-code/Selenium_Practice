package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Step 1 - create object of actions class
		
		Actions act = new Actions(driver);
		
		//Step2 - Write locator for right webelement
		
		WebElement rightclickele = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		
		
		// 
		act.contextClick(rightclickele).build().perform();
	}

}
