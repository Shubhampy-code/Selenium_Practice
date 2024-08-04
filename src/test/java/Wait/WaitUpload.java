package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\Shubham Shrivastava\\Desktop\\resume_shubham.pdf");
		
		driver.findElement(By.name("send")).click();
		
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//h3[@id='res']")).getText();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h3[@id='res']")), text));
		
		if (text.contains("uploaded")) {
			System.out.println("My file is sucessfully uploaded");
		}

	}

}
