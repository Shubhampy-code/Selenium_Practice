package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleForm {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://v1.training-support.net/selenium/simple-form");
		
		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Shubham");
		
		driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Shrivastava");
		
		driver.findElement(By.xpath("//input[@placeholder=\"abc@xyz.com\"]")).sendKeys("Shubham.123@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder=\"9876543210\"]")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		//driver.close();  // will only close 1 instance og browser .
		// driver.quit(); // will close all the instance of the browser.
		

	}

}
