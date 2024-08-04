package Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/nested-iframes");
		driver.manage().window().maximize();
		WebElement ParentFrame = driver.findElement(By.cssSelector("[src='/selenium/nested-iframe1']"));
		driver.switchTo().frame(ParentFrame);
		WebElement frame1 = driver.findElement(By.cssSelector("[src=\"/selenium/frame1\"]"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.id("actionButton")).click();
		
		driver.switchTo().defaultContent();
		ParentFrame = driver.findElement(By.cssSelector("[src='/selenium/nested-iframe1']"));
		driver.switchTo().frame(ParentFrame);
		
		WebElement frame2 = driver.findElement(By.cssSelector("[src=\'/selenium/frame2\']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.id("actionButton")).click();
		
		
		

	}

}
