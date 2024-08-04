package Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\Shubham Shrivastava\\Desktop\\resume_shubham.pdf");
		
		driver.findElement(By.name("send")).click();
		
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//h3[@id='res']")).getText();
		
		if (text.contains("uploaded")) {
			System.out.println("My file is sucessfully uploaded");
		}
	}

}
