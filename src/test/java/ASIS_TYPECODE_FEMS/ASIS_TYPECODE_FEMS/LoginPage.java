package ASIS_TYPECODE_FEMS.ASIS_TYPECODE_FEMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public WebDriver driver;
	@BeforeClass
	public void browser() throws InterruptedException {
		 	
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
    	driver = new ChromeDriver(options);
		
		driver.get("http://122.165.250.10:7500/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("LoginName")).sendKeys("admin");
		driver.findElement(By.id("Password")).sendKeys("Welcome@123");
		driver.findElement(By.id("btnlogin")).click();
		Thread.sleep(3000);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@class=\"gm\"]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()=\"Master\"]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()=\"FEMS\"]")).click();
}
}
