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


public class Hustling extends StringValues {

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

	//Initialization
	@Before
	public void setUp() throws Exception {
		setBrowser();
		browserConfig();
		driver.get("http://172.16.0.133:8083/?#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	@Test
	public void CreateHustling() throws Exception{
		loginUser();
		Thread.sleep(20000);
		Createhustling();
		Thread.sleep(2000);
		SaveBTN();
		if (driver.getPageSource().contains("Hustling"))
		{
			System.out.println("Hustling- Test Pass");
		}else {
			System.out.println("Hustling  - Test Failed");
			Thread.sleep(2000);
		}
	}


@Test
public void CancelHustling() throws Exception{
	loginUser();
	Thread.sleep(20000);
	Createhustling();
	Thread.sleep(2000);
	CancelBTN();
	if (driver.getPageSource().contains("Hustling"))
	{
		System.out.println("Cancel Hustling- Test Pass");
	}else {
		System.out.println("Cancel Hustling  - Test Failed");
		Thread.sleep(2000);
	}
}
@Test
public void MissingCustomer() throws Exception{
	loginUser();
	Thread.sleep(2000);
	Missingcustomer();
	Thread.sleep(2000);
	SaveBTN();
	if (driver.getPageSource().contains("required"))
	{
		System.out.println("Missing customer- Test Pass");
	}else {
		System.out.println("Missing customer - Test Failed");
		Thread.sleep(2000);
	}
}
@Test
public void Missingcargotype() throws Exception{
	loginUser();
	Thread.sleep(2000);
	Createhustling();
	driver.findElement(By.xpath(Inputcargotype)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
	Thread.sleep(2000);
	SaveBTN();
	if (driver.getPageSource().contains("require"))
	{
		System.out.println("Missing cargo Type- Test Pass");
	}else {
		System.out.println("Missing cargo Type - Test Failed");
		Thread.sleep(2000);
	}
}	
@Test
public void MissingTotalunload() throws Exception{
	loginUser();
	Thread.sleep(20000);
	Createhustling();
	driver.findElement(By.xpath(inputunload)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
	Thread.sleep(2000);
	SaveBTN();
	if (driver.getPageSource().contains("Required"))
	{
		System.out.println("Missing Total Unload- Test Pass");
	}else {
		System.out.println("Missing Total Unload  - Test Failed");
		Thread.sleep(2000);
	}
}










private void Createhustling() throws Exception {
	driver.findElement(By.xpath(Bookingbtn)).click(); 
	Thread.sleep(1000);
	driver.findElement(By.xpath(Hustlingbtn)).click(); 
	Thread.sleep(1000);
	driver.findElement(By.xpath(Addhustlingbtn)).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(Selectcustomer)).click(); 
	Thread.sleep(1000);
	int i;

	for ( i=1; i<5; i++) {
		driver.findElement(By.xpath(Selectcustomer)
				).sendKeys(Keys.ARROW_DOWN);

		if(i == 4){
			driver.findElement(By.xpath(Selectcustomer
					)).sendKeys(Keys.ENTER);}}
	driver.findElement(By.xpath(Inputcargotype)).sendKeys(RandomStringUtils.randomAlphabetic(5));
	driver.findElement(By.xpath(inputunload)).sendKeys(RandomStringUtils.randomNumeric(5));

}

private void loginUser() {

	driver.findElement(By.xpath(Usernamefd)).sendKeys(AuthUsername);
	driver.findElement(By.xpath(Passwordfield)).click();
	driver.findElement(By.xpath(Passwordfield)).sendKeys(AuthPassword);
	driver.findElement(By.xpath(Loginbtn)).click();
}
private void Missingcustomer() throws Exception {
	driver.findElement(By.xpath(Bookingbtn)).click(); 
	Thread.sleep(1000);
	driver.findElement(By.xpath(Hustlingbtn)).click(); 
	Thread.sleep(1000);
	driver.findElement(By.xpath(Addhustlingbtn)).click();
	Thread.sleep(1000);
	int i;

	for ( i=1; i<5; i++) {
		driver.findElement(By.xpath(Selectcustomer)
				).sendKeys(Keys.ARROW_DOWN);

		if(i == 4){
			driver.findElement(By.xpath(Selectcustomer
					)).sendKeys(Keys.ENTER);}}
	driver.findElement(By.xpath(Inputcargotype)).sendKeys(RandomStringUtils.randomAlphabetic(5));
	driver.findElement(By.xpath(inputunload)).sendKeys(RandomStringUtils.randomNumeric(5));

}
private void SaveBTN() {
	driver.findElement(By.xpath(Savebtn)).click();
}
private void CancelBTN() {
	driver.findElement(By.xpath(Cancelbtn)).click();
}

@After
public void tearDown() throws Exception {
	driver.quit();
}

}


