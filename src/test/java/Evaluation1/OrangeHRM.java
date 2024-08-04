package Evaluation1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		//Visit the login page.
		
		
		//Implicit wait  will wait for 5 sec before throwing exception.
		//This is a global wait.
		// we have to mention implicit wait only once in the script.
		//We have to mention implicit wait at the start of the script.
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//WebElement Username = driver.findElement(By.cssSelector("[name=\"username\"]"));
		//WebElement Password = driver.findElement(By.cssSelector("[type=\"password\"]"));
		//Enter the username and password.
		
		//Explicit wait
		// step1 -- Creat object for WebdriverWait class.
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[name=\"username\"]"))).sendKeys("Admin");
		
		
		//driver.findElement(By.cssSelector("[name=\"username\"]")).sendKeys("Admin");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type=\"password\"]"))).sendKeys("admin123");
		//driver.findElement(By.cssSelector("[type=\"password\"]")).sendKeys("admin123");
		
		//Click the login button.
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
		//Navigate to the Admin tab.
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[1]")).click();
		
		// Select 'User Management' from the dropdown.
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//i[@class=\"oxd-icon bi-chevron-down\"])[1]")).click();
		//Click 'Users'.
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[role=\"menuitem\"]")).click();
		
		//Locate the Employee Name dropdown and click on the checkbox
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class=\"oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input\"])[7]")).click();
		
		Thread.sleep(4000);
		//Assert the name and status
		String name = driver.findElement(By.xpath("(//div[@class=\"oxd-table-cell oxd-padding-cell\"])[34]")).getText();
		String status = driver.findElement(By.xpath("(//div[@class=\"oxd-table-cell oxd-padding-cell\"])[35]")).getText();
		
		//name.equals("Sakshi Gothi") &&
		if( status.equals("Enabled")) {
			System.out.println("RightName");
			
		}
		
		//Logout of the application.
		Thread.sleep(5000);
		WebElement DropDown = driver.findElement(By.cssSelector("[class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]"));
		
		Select s = new Select(DropDown);
		Thread.sleep(5000);
		s.selectByVisibleText("Logout");
		

		
	}
}
