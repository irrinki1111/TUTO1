package ASIS_TYPECODE_FEMS.ASIS_TYPECODE_FEMS;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StandardTaskDetailsFEMS extends LoginPage {

	@Test
	public void standardtask() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/ul/li[5]/ul/li[3]/a")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Add\"]/div")).click();
		
		Thread.sleep(3000);
		Select workgroupcode = new Select(driver.findElement(By.xpath("id=\"WorkGroupCode\"")));
		Thread.sleep(2000);
		workgroupcode.selectByVisibleText("Data1");
	}
}
