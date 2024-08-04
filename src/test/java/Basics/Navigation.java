package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.linkText("Daily Deals")).click();
		
		driver.findElement(By.xpath("//span[@class='ebayui-ellipsis-3']")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		

	}

}
