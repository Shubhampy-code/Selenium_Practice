package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		driver.findElement(By.cssSelector("[src=\"http://jqueryui.com/resources/demos/datepicker/images/calendar.gif\"]")).click();
		
		WebElement visible_month = driver.findElement(By.className("ui-datepicker-month"));
		WebElement visible_year = driver.findElement(By.className("ui-datepicker-year"));
		
		String monthText = visible_month.getText();
		String yearText = visible_year.getText();
		
		Thread.sleep(2000);
		
		while(!(monthText.equals("May") && yearText.equals("1997"))){
			driver.findElement(By.cssSelector("[class='ui-icon ui-icon-circle-triangle-w']")).click();
			
			monthText = driver.findElement(By.className("ui-datepicker-month")).getText();
			yearText = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"ui-state-default\" and .=8]")).click();

	}

}
