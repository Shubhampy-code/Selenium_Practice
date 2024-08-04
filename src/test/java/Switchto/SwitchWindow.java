package Switchto;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("openwindow")).click(); 
		
		
		
		String parentid = driver.getWindowHandle();
		Set<String> allids = driver.getWindowHandles();
		
		String Expectedtitle = "QAClick Academy - A Testing Academy to Learn, Earn and Shine";
		
		for(String id : allids){
			driver.switchTo().window(id); 
			if(driver.getTitle().equals(Expectedtitle)) {
				break;
		}
		
		driver.findElement(By.linkText("Access all our Courses")).click();
		
		driver.switchTo().window(parentid); //this switched back to parent window.
		
		driver.findElement(By.id("autocomplete")).sendKeys("Switched back sucessfully");

	}

}
