package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.ebay.com/");
		WebElement search = driver.findElement(By.cssSelector("[aria-label=\"Search for anything\"]"));
		search.sendKeys("Shoes",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("Window.scrollBy(0,1000)");
		js.executeScript("Window.scrollBy(0,-1000)");
		search.clear();
		driver.close();
		
	}

}
