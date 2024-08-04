package Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtab2 {

	public static void main(String[] args) {
		
		//This approach does not oen a new tab , but instead work only on one tab.
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement opentab = driver.findElement(By.id("opentab")); // it will open the new tab
		
		String URL = opentab.getAttribute("href");

		driver.navigate().to(URL);
		
		driver.findElement(By.linkText("Access all our Courses")).click();
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
	
	
	}

}
