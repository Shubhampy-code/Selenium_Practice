package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we are creating ChromeDriver object with WebDriver interface
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
	}

}
