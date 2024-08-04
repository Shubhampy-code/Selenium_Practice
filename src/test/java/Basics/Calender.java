package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		//driver.findElement(By.cssSelector(".hasDatepicker")).sendKeys("08/05/2025",Keys.ENTER);

		
		//2nd approach
		
		driver.findElement(By.cssSelector(".hasDatepicker")).click();
		
		WebElement actualmonth = driver.findElement(By.cssSelector(".ui-datepicker-month"));
		
		WebElement actualYear = driver.findElement(By.cssSelector(".ui-datepicker-year"));
		
		String monthText = actualmonth.getText();
		String yearText =  actualYear.getText();
		
		Thread.sleep(2000);
		while(!(monthText.equals("December")&& yearText.equals("2025"))) {
			
			driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
			
			monthText = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
			
			yearText = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
			
		
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"ui-state-default\" and  .=31]")).click();
	}

}
