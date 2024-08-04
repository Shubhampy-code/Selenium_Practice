package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[name=\"username\"]"))).sendKeys("Admin");

		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type=\"password\"]"))).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

	}

}
