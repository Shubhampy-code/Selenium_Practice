package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		//step1 -- read external file using FileInputStream
		

		FileInputStream fs = new FileInputStream("C:\\Users\\Shubham Shrivastava\\Documents\\DataFolder\\Data.xlsx");
		
		// Step2-- Use apache library to connect to excel WorkbookFactory
		
		Workbook book = WorkbookFactory.create(fs); // this will creat a new stance for workbook


		
		String username = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		String Password = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys(username);
		
		driver.findElement(By.cssSelector("[name=\"pass\"]")).sendKeys(Password);
		
		driver.findElement(By.cssSelector("[name=\"login\"]")).click();
		
		book.close();
		
		
		
	}

}
