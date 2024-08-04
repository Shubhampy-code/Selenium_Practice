package JS;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// I want to call java Script Exector
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Execute javascript commands using javascriptExecytor,using executorscript()
		
		js.executeScript("document.getElementById('autocomplete').value = 'hi good morning'");
		js.executeScript("document.getElementById('checkBoxOption1').click();");

		js.executeScript("window.scrollBy(0,900)");
		
		//scroll into view of a particular element.
		
		//js.executeScript("arguments[0].scrollIntoView()",);	
	}

}
