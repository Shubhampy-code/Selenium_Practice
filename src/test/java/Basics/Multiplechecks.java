package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplechecks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> checks = driver.findElements(By.cssSelector("[type='checkbox']"));
		
		// iterate over all elements using foreach loop then clicking on it.
		for (WebElement ch : checks) {
			
			ch.click();
		
		};

	}

}
