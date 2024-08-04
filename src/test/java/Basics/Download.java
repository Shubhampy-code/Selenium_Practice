package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.cssSelector("[class=\"btn btn-primary\"]")).click();
		
		
		driver.findElement(By.cssSelector("[id=\"textbox\"]")).sendKeys("Hi, This is shubham");
		driver.findElement(By.cssSelector("[id=\"createTxt\"]")).click();
		driver.findElement(By.cssSelector("[id=\"link-to-download\"]")).click();
		
		driver.findElement(By.cssSelector("[id=\"pdfbox\"]")).sendKeys("Shubham Shrivastava");
		driver.findElement(By.cssSelector("[id=\"createPdf\"]")).click();
		driver.findElement(By.cssSelector("[id=\"pdf-link-to-download\"]")).click();

	}

}
