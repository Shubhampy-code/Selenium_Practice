package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAtFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/iframes");
		driver.manage().window().maximize();
		WebElement frame1 = driver.findElement(By.xpath("(//iframe)[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("(//iframe)[1]")));
		driver.findElement(By.id("actionButton")).click();
		//driver.switchTo().frame(frame1).findElement(By.id("actionButton")).click();
		
		//driver.findElement(By.id("actionButton")).click();
		//switch back the control from frame to default page.
		driver.switchTo().defaultContent();
		
		String Text = driver.findElement(By.xpath("(//div[contains(.,'following iframes!')])[5]")).getText();
		
		//driver.switchTo().frame(1); // switching to frame using index method
		//driver.findElement(By.id("actionButton")).click();
		
		
		
		WebElement frame2 = driver.findElement(By.xpath("(//iframe)[2]"));
		
		
		driver.switchTo().frame((frame2)).findElement(By.id("actionButton")).click();
	

	}

}
