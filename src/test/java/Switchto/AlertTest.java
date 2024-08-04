package Switchto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) {
		try {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("[placeholder='Enter Your Name']")).sendKeys("Shubham");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[value='Confirm']")).click();
		
		Alert ale = driver.switchTo().alert();
		
		String alerttext = ale.getText();
		
		System.out.println(alerttext);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(1000);
		
		if(alerttext.contains("Shubham")) {
			driver.close();
		}
		}catch(Exception e) {
			
		}
	}

}
