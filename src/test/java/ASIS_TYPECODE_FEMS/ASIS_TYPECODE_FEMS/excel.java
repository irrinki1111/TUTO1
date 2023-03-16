package ASIS_TYPECODE_FEMS.ASIS_TYPECODE_FEMS;

import java.io.File;
import java.io.FileInputStream;

import org.apache.logging.log4j.core.tools.picocli.CommandLine.Help.TextTable.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excel {

	public String entry2;
	public String entry1;

	@Test
	public void data() throws Exception {

		File src = new File("C:\\Users\\naidu\\OneDrive\\Desktop\\Data1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = xsf.getSheetAt(0);
		
		String entry1 = sheet.getRow(0).getCell(0).getStringCellValue();
		
		String entry2 = sheet.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(entry2);
		
		System.out.println(entry1);
		
		xsf.close();
}
}
