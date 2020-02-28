package TESTBDS;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MISC extends StringValues {
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
			}e
			
			
			@Before
			public void setUp() throws Exception {
				setBrowser();
				browserConfig();
				driver.get("http://172.16.0.133:8083/?#/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
			
			@Test
			public void CreateActivity() throws Exception {
				loginUser();
				Thread.sleep(2000);
				Activityinfo();
				SaveBTN();
				Thread.sleep(2000);
				if (driver.getPageSource().contains("Actions"))
				{
					System.out.println("CreateActivity- Test Pass");
				}else {
					System.out.println("CreateActivity- Test Failed");
				}
				
			}
			
			@Test
			public void CancelActivity() throws Exception {
				loginUser();
				Thread.sleep(2000);
				Activityinfo();
				CancelBTN();
				Thread.sleep(2000);
				if (driver.getPageSource().contains("Actions"))
				{
					System.out.println("CancelActivity- Test Pass");
				}else {
					System.out.println("CancelActivity- Test Failed");
					
				}
				
			}
			
			@Test
			public void MissingActivity() throws Exception {
				loginUser();
				Thread.sleep(2000);
				Activityinfo();
				driver.findElement(By.xpath(MISCbtn)).click(); 
				driver.findElement(By.linkText(Activitybtn)).click(); 
				Thread.sleep(2000);
				driver.findElement(By.xpath(Addactivity)).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(Selectstatus)).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(Selectstatus)).sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(2000);
				driver.findElement(By.xpath(Selectstatus)).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
				Thread.sleep(3000);
				driver.findElement(By.xpath(Inputactivity)).sendKeys("Travel to " + RandomStringUtils.randomAlphabetic(5)); 
				Thread.sleep(2000);
				
				driver.findElement(By.xpath(Inputactivity)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
				SaveBTN();
				Thread.sleep(2000);
				if (driver.getPageSource().contains("Actions"))
				{
					System.out.println("MissingActivity- Test Pass");
				}else {
					System.out.println("MissingActivity- Test Failed");
					
				}
				
			}
			
			private void Activityinfo() throws Exception {
				driver.findElement(By.xpath(MISCbtn)).click(); 
				driver.findElement(By.linkText(Activitybtn)).click(); 
				Thread.sleep(2000);
				driver.findElement(By.xpath(Addactivity)).click(); 
				driver.findElement(By.xpath(Selectstatus)).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(Selectstatus)).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
				Thread.sleep(2000);
				driver.findElement(By.xpath(Inputactivity)).sendKeys("Travel to " + RandomStringUtils.randomAlphabetic(5)); 
				Thread.sleep(2000);
			}
			
			private void SaveBTN() {
				driver.findElement(By.xpath(Savebtn)).click();
			}
			private void CancelBTN() {
				driver.findElement(By.xpath(CancelCustomer)).click();
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

