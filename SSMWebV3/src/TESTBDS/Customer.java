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

public class Customer extends StringValues {
	private WebDriver driver;
	static String browser;
	static String whoUser;
 
	public void setBrowser() {
		whoUser = "arnie";
		browser = "Chrome";
	}

	public void browserConfig () {

		if (whoUser.contains("arnie")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLACK PHOENIX\\git\\SSMV3\\SSMWebV3\\libs\\chromeDriver\\chromedriver.exe");
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
	public void CreateCustomer() throws Exception {
		loginUser();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(customerbtn)).click(); 
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Customerinfo();
		SaveBTN();
		Thread.sleep(5000);
		if (driver.getPageSource().contains("Monthly Booking"))
		{
			System.out.println("Customer- Test Pass");
		} else {
		
			System.out.println("Customer - Test Failed");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	}
	
		@Test
		public void MissingCompanyName() throws Exception {
			loginUser();
			//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(customerbtn)).click(); 
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(3000);
			Customerinfo();
			driver.findElement(By.xpath(Companyname)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
			SaveBTN();
			Thread.sleep(5000);
			if (driver.getPageSource().contains("required"))
			{
				System.out.println("MissingCustomerName- Test Pass");
			}else {
				System.out.println("MissingCustomerName - Test Failed");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
		}
		@Test
		public void MissingCustomercode() throws Exception {
			loginUser();
			//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(customerbtn)).click(); 
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(3000);
			Customerinfo();
			driver.findElement(By.xpath(Customercode)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
			SaveBTN();
			Thread.sleep(5000);
			if (driver.getPageSource().contains("required"))
			{
				System.out.println("MissingCustomercode- Test Pass");
			}else {
				System.out.println("MissingCustomercode - Test Failed");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
		}
		@Test
		public void MissingPersonincharge() throws Exception {
			loginUser();
			//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(customerbtn)).click(); 
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(3000);
			Customerinfo();
			driver.findElement(By.xpath(Personincharge)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
			SaveBTN();
			Thread.sleep(5000);
			if (driver.getPageSource().contains("required"))
			{
				System.out.println("MissingPersonincharge- Test Pass");
			}else {
				System.out.println("MissingPersonincharge - Test Failed");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
		}
		@Test
		public void Missingcontactnumber() throws Exception {
			loginUser();
			//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(customerbtn)).click(); 
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(3000);
			Customerinfo();
			driver.findElement(By.xpath(Personincharge)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
			SaveBTN();
			Thread.sleep(5000);
			if (driver.getPageSource().contains("required"))
			{
				System.out.println("Missingcontactnumber- Test Pass");
			}else {
				System.out.println("Missingcontactnumber - Test Failed");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
		}
		
		@Test
		public void MissingAddress() throws Exception {
			loginUser();
			//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(customerbtn)).click(); 
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(3000);
			Customerinfo();
			driver.findElement(By.xpath(Contactnumb)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
			SaveBTN();
			Thread.sleep(5000);
			if (driver.getPageSource().contains("required"))
			{
				System.out.println("MissingAddress- Test Pass");
			}else {
				System.out.println("MissingAddress - Test Failed");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
		}
		@Test
		public void CancelCustomer() throws Exception {
			loginUser();
			//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(customerbtn)).click(); 
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(3000);
			Customerinfo();
			CancelBTN();
			Thread.sleep(2000);
			if (driver.getPageSource().contains("Monthly Booking"))
			{
				System.out.println("CancelCustomer- Test Pass");
			} else {
				System.out.println("CancelCustomer - Test Failed");
			}
		}
		
	
	
	
	
	
	
	private void Customerinfo() throws Exception {
		driver.findElement(By.xpath(Addcustomerbtn)).click(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Companyname)).sendKeys(RandomStringUtils.randomAlphabetic(5));
		driver.findElement(By.xpath(Customercode)).sendKeys(RandomStringUtils.randomNumeric(6));
		driver.findElement(By.xpath(Personincharge)).sendKeys(RandomStringUtils.randomAlphabetic(5));
		driver.findElement(By.xpath(Contactnumb)).sendKeys(RandomStringUtils.randomNumeric(9));
		driver.findElement(By.xpath(Address)).sendKeys(RandomStringUtils.randomAlphabetic(10));
		driver.findElement(By.xpath(EmailAdd)).sendKeys(RandomStringUtils.randomAlphabetic(5)+"@gmail.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	private void SaveBTN() {
		driver.findElement(By.xpath(Savebtn)).click();
	}
	private void CancelBTN() {
		driver.findElement(By.xpath(CancelCustomer)).click();
	}
	
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

