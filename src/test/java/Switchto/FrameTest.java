package Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/iframes");
		driver.manage().window().maximize();
		WebElement frame1 = driver.findElement(By.xpath("(//iframe)[1]"));
		driver.switchTo().frame(frame1).findElement(By.id("actionButton")).click();
		
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
