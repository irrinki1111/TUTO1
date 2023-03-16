package ASIS_TYPECODE_FEMS.ASIS_TYPECODE_FEMS;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WorkGroupDetailsFEMS extends LoginPage {
        @Test
        public void workgroup() throws Exception {
		
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/ul/li[5]/ul/li[1]/a")).click();
		
		Thread.sleep(5000);
		
        File src = new File("C:\\Users\\naidu\\OneDrive\\Desktop\\Data1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = xsf.getSheetAt(0);
		
		String entry1 = sheet.getRow(0).getCell(1).getStringCellValue();
		
		String entry2 = sheet.getRow(1).getCell(1).getStringCellValue();
		
		String entry3 = sheet.getRow(2).getCell(1).getStringCellValue();
		
		xsf.close();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"col-sm-12 \"]/a")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"WorkGroupCode5\"]")).sendKeys(entry1);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"WorkGroupDescription5\"]")).sendKeys(entry2);
		
		Thread.sleep(3000);
		Select status = new Select(driver.findElement(By.xpath("//select[@id=\"Status5\"]")));
		status.selectByVisibleText(entry3);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id=\"WorkSave\"]")).click();
		
	}
}

