package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// By ==>  By is the class
		// findelement ==>  method
		// classname ==> static method
		
		
		driver.findElement(By.className("ui-autocomplete-input")).sendKeys("Hi this is Shubham");
		
		Thread.sleep(2000);  // wait command - wait for 2 seconds.
		//Id locator
		
		driver.findElement(By.id("autocomplete")).clear();
		
		driver.findElement(By.id("autocomplete")).sendKeys("Hi,I am Shubham Shrivastava");
		
		//click on radio button - using css selector
		
		driver.findElement(By.cssSelector("[value=\'radio1\']")).click();
		driver.findElement(By.cssSelector("[value=\'radio2\']")).click();
		driver.findElement(By.cssSelector("[value=\'radio3\']")).click();
		
		
		
		

	}

}
