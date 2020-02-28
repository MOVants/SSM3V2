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

public class Login extends StringValues{
	private static final String Passwordfd = null;
	private WebDriver driver;
	static String browser;
	static String whoUser;
	
	public void setBrowser() {
		whoUser = "arnie";
		browser = "Chrome";
	}
	
	
	public void browserConfig () {
		
		if (whoUser.contains("arnie")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLACK PHOENIX\\git\\SSMV3\\SSMWebV3\\libs\\chromedr\\chromedriver.exe");
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
	public void loginTest() throws Exception {
		loginUser();
		Thread.sleep(2000);
	if (driver.getPageSource().contains("Safesat"))
	{
		System.out.println("Login - Test Pass");
	}
	else {
		System.out.println("Login - Test failed");
	}	
}
	@Test
	public void InvalidUsername() throws Exception {
		LoginUser2();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Usernamefd)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Usernamefd)).sendKeys(RandomStringUtils.randomAlphabetic(5)+"@gmail.com");
		Thread.sleep(2000);
	if (driver.getPageSource().contains("SafeSat Booking and Dispatching"))
	{
		System.out.println("InvalidUsername- Test Pass");
	}
	else {
		System.out.println("InvalidUsername- Test failed");
	}	
}
	@Test
	public void InvalidPassword() throws Exception {
		LoginUser2();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Passwordfield)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Passwordfield)).sendKeys(RandomStringUtils.randomNumeric(5));
		Thread.sleep(2000);
	if (driver.getPageSource().contains("SafeSat Booking and Dispatching"))
	{
		System.out.println("InvalidPassword - Test Pass");
	}
	else {
		System.out.println("InvalidPassword - Test failed");
	}
}
	@Test
	public void Invalidcredentials() throws Exception {
		driver.findElement(By.xpath(Usernamefd)).sendKeys(RandomStringUtils.randomAlphabetic(5)+"@gmail.com");
		driver.findElement(By.xpath(Passwordfield)).sendKeys(RandomStringUtils.randomNumeric(5));
		driver.findElement(By.xpath(Loginbtn)).click();
		Thread.sleep(2000);
	if (driver.getPageSource().contains("SafeSat Booking and Dispatching"))
	{
		System.out.println("Invalidcredentials- Test Pass");
	}
	else {
		System.out.println("Invalidcredentials - Test failed");
	}
	}
	@Test
	public void MissingUsername() throws Exception {
		loginUser();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Usernamefd)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
		
	if (driver.getPageSource().contains("required"))
	{
		System.out.println("MissingUsername- Test Pass");
	}
	else {
		System.out.println("MissingUsername- Test failed");
	}	
}
	@Test
	public void MissingPassword() throws Exception {
		LoginUser2();
		driver.findElement(By.xpath(Passwordfield)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
		driver.findElement(By.xpath(Loginbtn)).click();
		Thread.sleep(5000);
		
	if (driver.getPageSource().contains("required"))
	{
		System.out.println("MissingPassword- Test Pass");
	}
	else {
		System.out.println("MissingPassword- Test failed");
	}	
}
	
	
	
	//Login user
	private void loginUser() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath(Usernamefd)).sendKeys(AuthUsername);
		driver.findElement(By.xpath(Passwordfield)).click();
		driver.findElement(By.xpath(Passwordfield)).sendKeys(AuthPassword);
		driver.findElement(By.xpath(Loginbtn)).click();
	}
	//Login user 2
	private void LoginUser2() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath(Usernamefd)).sendKeys(AuthUsername);
		driver.findElement(By.xpath(Passwordfield)).click();
		driver.findElement(By.xpath(Passwordfield)).sendKeys(AuthPassword);
		
	}
	
	//private void setBrowserConfig() { }
	
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}	
}
