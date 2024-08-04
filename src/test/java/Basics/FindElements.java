package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		// i want to fetch all the links present in this webpage.
		
		// we are using findelements() to fetch multiple.
		
		List<WebElement> Ebay_links = driver.findElements(By.tagName("a"));
		
		
		// Iterting all the links using foreach.
		for(WebElement link: Ebay_links) {
			
			String links_name = link.getText();
			
			System.out.println(links_name);
		}
		

	}

}
