package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Step 1 --> Write the locator for the dropdown.
		
		WebElement dropdown = driver.findElement(By.cssSelector("#dropdown-class-example"));
		
		//Step 2 -> Create Select class object
		
		Select s = new Select(dropdown);
		
		// step 3--> Use method select class - Select by index
		
		s.selectByIndex(2);
		
		// Step 4 -->  Select by visible Text
		
		s.selectByVisibleText("Option3");

		// Step 5 --> Select by value
		s.selectByValue("option1"); 
		
	}

}
