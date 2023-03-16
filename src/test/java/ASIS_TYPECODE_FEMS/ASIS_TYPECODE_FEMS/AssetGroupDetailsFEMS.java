package ASIS_TYPECODE_FEMS.ASIS_TYPECODE_FEMS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AssetGroupDetailsFEMS extends LoginPage{

	@Test
	public void assetgroup() throws InterruptedException, Exception {
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/ul/li[5]/ul/li[2]/a")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=\"Add\"]")).click();
		
        File src = new File("C:\\Users\\naidu\\OneDrive\\Desktop\\Data1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = xsf.getSheetAt(1);
		
		String entry1 = sheet.getRow(0).getCell(1).getStringCellValue();
		
		String entry2 = sheet.getRow(1).getCell(1).getStringCellValue();
		
		String entry3 = sheet.getRow(2).getCell(1).getStringCellValue();
		
		String entry4 = sheet.getRow(3).getCell(1).getStringCellValue();
		
		System.out.println(entry4);
		xsf.close();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"AssetGroupCode\"]")).sendKeys(entry1);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"AssetGroupDescription\"]")).sendKeys(entry2);
		
		Thread.sleep(3000);
		Select status = new Select(driver.findElement(By.xpath("//select[@id=\"status\"]")));
		
		status.selectByVisibleText(entry3);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id=\"Remarks\"]")).sendKeys(entry4);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id=\"Add\"]")).click();
	}
}
