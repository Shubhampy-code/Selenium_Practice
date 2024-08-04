package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait  will wait for 5 sec before throwing exception.
		//This is a global wait.
		// we have to mention implicit wait only once in the script.
		//We have to mention implicit wait at the start of the script.
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.cssSelector("[name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("[type=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
	}

}
