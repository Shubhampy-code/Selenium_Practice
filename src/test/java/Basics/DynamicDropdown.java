package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//div[contains(text(),'Japan')])[1]")).click();
		
		driver.findElement(By.cssSelector("[placeholder='Type to Select Countries']")).sendKeys("jap");
		
		
		List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
		Thread.sleep(1000);
		for (WebElement opt : options) {
			Thread.sleep(1000);
			if(opt.getText().equals("Japan")) {
				opt.click();
			}
			
		}
	}

}
