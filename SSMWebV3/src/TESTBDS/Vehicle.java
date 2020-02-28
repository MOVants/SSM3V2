package TESTBDS;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vehicle extends StringValues{
	
		private WebDriver driver;
		static String browser;
		static String whoUser;
	 
		public void setBrowser() {
			whoUser = "arnie";
			browser = "Chrome";
		}

		public void browserConfig () {

			if (whoUser.contains("arnie")) {
				System.setProperty("webdriver.chrome.driver",  "C:\\Users\\BLACK PHOENIX\\git\\SSMV3\\SSMWebV3\\libs\\chromedr\\chromedriver.exe");
			}
			driver = new ChromeDriver();
		}
		
		
		@Before
		public void setUp() throws Exception {
			setBrowser();
			browserConfig();
			driver.get("http://172.16.0.133:8083/?#/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
		@Test
		public void Filterstatus() throws Exception {
			
		
			loginUser();
			driver.findElement(By.xpath(Vehiclebtn)).click(); 
			driver.findElement(By.xpath(All)).click();
			driver.findElement(By.xpath(Available)).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(All)).click();
			driver.findElement(By.xpath(loading)).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(All)).click();
			driver.findElement(By.xpath(loadingcomplete)).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(All)).click();
			driver.findElement(By.xpath(Intransit)).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(All)).click();
			driver.findElement(By.xpath(Maintenance)).click();
			Thread.sleep(3000);
		}
		
		
		//Login	
		private void loginUser() throws Exception {

			driver.findElement(By.xpath(Usernamefd)).sendKeys(AuthUsername);
			driver.findElement(By.xpath(Passwordfield)).click();
			driver.findElement(By.xpath(Passwordfield)).sendKeys(AuthPassword);
			driver.findElement(By.xpath(Loginbtn)).click();
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
		@After
		public void tearDown() throws Exception {
			driver.quit();
		}
}


