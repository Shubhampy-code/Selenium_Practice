package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleRadio {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		List<WebElement> radios = driver.findElements(By.cssSelector("[name='radioButton']"));
		
		for (WebElement radio : radios) {
			radio.click();
			Thread.sleep(1000);
			
		}
	}

}
