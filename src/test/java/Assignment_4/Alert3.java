package Assignment_4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 {

	public static void main(String[] args) throws InterruptedException {
		try {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(2000);
		
		Alert altBox = driver.switchTo().alert();
		altBox.sendKeys("Shubham");
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		
		WebElement massageBox = driver.findElement(By.cssSelector("[id='output']"));
		
		String massage = massageBox.getText();
		if(massage.contains("You entered text Shubham in propmt popup")) {
			driver.close();
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
