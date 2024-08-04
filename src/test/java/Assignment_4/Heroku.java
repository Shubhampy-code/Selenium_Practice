package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Heroku {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		WebElement openTab = driver.findElement(By.cssSelector("[href=\"http://elementalselenium.com/\"]"));
		String URL = openTab.getAttribute("href");
		
		driver.navigate().to(URL);
		driver.findElement(By.cssSelector("[id=\"email\"]")).sendKeys("Shubham.123@gmail.com");
		WebElement DropDown = driver.findElement(By.cssSelector("[id=\"options\"]"));
		Select s = new Select(DropDown);
		s.selectByVisibleText("Python");
		
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
		driver.navigate().back();
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("[name=\"username\"]")).sendKeys("tomsmith");
		driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("SuperSecretPassword!");
		
		driver.findElement(By.cssSelector("[class=\"fa fa-2x fa-sign-in\"]")).click();
		
	}

}
