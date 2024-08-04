package Switchto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		try {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("alertbtn")).click();
		
		Alert ale = driver.switchTo().alert();
		
		String alerttext = ale.getText();
		
		System.out.println(alerttext);
		
		ale.accept();  // it will click on Ok inside the alert/
		
		// Click on confirmation popup
		
		driver.findElement(By.cssSelector("[value='Confirm']")).click();
		
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		driver.close();
		}
		catch(Exception e) {
			
		}
	}

}
