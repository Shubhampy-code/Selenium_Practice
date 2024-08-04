package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		//In partial link text - we can give the partial name of the link

		driver.findElement(By.partialLinkText("Electron")).click();
		
		driver.findElement(By.partialLinkText("Deals")).click();
	}

}
