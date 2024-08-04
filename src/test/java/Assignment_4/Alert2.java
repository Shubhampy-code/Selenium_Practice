package Assignment_4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) {
		try {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
			driver.findElement(By.id("confirmBox")).click();
			
			Thread.sleep(2000);
			
			Alert alt = driver.switchTo().alert();
			
			String altMassage = alt.getText();
			System.out.println(altMassage);
			
			driver.switchTo().alert().dismiss();
			
			driver.findElement(By.id("confirmBox")).click();
			Thread.sleep(2000);

			driver.switchTo().alert().accept();
			
		}catch (Exception e) {
			
		}
	}
}