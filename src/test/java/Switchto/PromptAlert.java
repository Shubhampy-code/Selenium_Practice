package Switchto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		try {
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/javascript-alerts");
		
		driver.findElement(By.id("prompt")).click();
		
		Alert alertboxAlert = driver.switchTo().alert();
		
		driver.switchTo().alert().sendKeys("Shubham");
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		}catch(Exception e) {
			
		}
	}

}
