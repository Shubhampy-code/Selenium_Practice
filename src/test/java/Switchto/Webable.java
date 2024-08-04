package Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webable {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String text = driver.findElement(By.xpath("(//table)[2]/tbody/tr[4]/td[2]")).getText();
		
		if (text.equals("Receptionist")) {
			System.out.println("Test Case is passed");
		}

	}

}
