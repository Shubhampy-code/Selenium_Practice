package Assignment_4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) {
		
		try {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
			
			driver.findElement(By.id("alertBox")).click();
			Alert alert = driver.switchTo().alert();
			
			String alertMassage = alert.getText();
			
			System.out.println(alertMassage);
			
			alert.accept();
			
		}catch (Exception e) {
			
		}
		

	}

}
