package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLink {

	public static void main(String[] args) {
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// To fatch the links we need to use findelements()
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//fetech URLs from each link and then check for broken link conditions.
		
		for(WebElement link : links) {
			String Url = link.getAttribute("href");
			
			//title of webpage contains some error texts like-- Error, 402, 502, 
			//I will open a new instance of browser and enter URLS in those browsers.
			
			// and then i will check whether these link s are working or not.
			
			
			try {
				
			if(Url != null){
				
				driver = new FirefoxDriver();
				driver.get(Url);
				
				String title = driver.getTitle();
				
				if(title.contains("402")||title.contains("502")||title.contains("Error")||title.isEmpty()||title.equalsIgnoreCase("not found")) {
					System.out.println("The link is a broken link"+ Url);
				}else {
					System.out.println("Valid Link"+Url);
				}
				driver.close();
			}else {
				System.out.println("Not a valid URL"+ Url);
			}
			
			}catch (Exception e) {
				// TODO: handle exception
			}
		
		}
		
		driver.quit();
	}
	

}
