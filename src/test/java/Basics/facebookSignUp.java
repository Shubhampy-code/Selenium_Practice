package Basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookSignUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.cssSelector("[name='firstname']")).sendKeys("Shubham");
		driver.findElement(By.cssSelector("[name='lastname']")).sendKeys("Shrivastava");
		
		driver.findElement(By.cssSelector("[name='reg_email__']")).sendKeys("987456321");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("123456zxc");
		
		WebElement dayDrop = driver.findElement(By.cssSelector("[name='birthday_day']"));
		Select Day = new Select(dayDrop);	
		Day.selectByVisibleText("10");
		
		WebElement monthDrop = driver.findElement(By.cssSelector("[name='birthday_month']"));
		Select month = new Select(monthDrop);
		month.selectByVisibleText("May");
		
		WebElement yearDrop = driver.findElement(By.cssSelector("[name='birthday_year']"));
		Select year = new Select(yearDrop);
		year.selectByVisibleText("1947");
		
		driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).click();
		driver.findElement(By.cssSelector("[class=\"_6j mvm _6wk _6wl _58mi _3ma _6o _6v\"]")).click();
		
		
	}

}
