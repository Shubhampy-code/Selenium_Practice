package JS;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotStaticMethod {

	
	public static void capture(WebDriver driver, int n) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//using getscreenshotAs() to take screenshot

		File image = ts.getScreenshotAs(OutputType.FILE);
		
		File img = new File("C:\\Users\\Shubham Shrivastava\\Pictures\\Screenshots\\image"+n+".png");
		
		FileUtils.copyFile(image, img); 
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		//step1 --> calling takescreenshot interface and casting it to drive 
		capture(driver, 1);
		
		driver.findElement(By.partialLinkText("ResumeAssistance")).click();
		
		capture(driver, 2);
		
		driver.navigate().back();
		
		
	}

}
