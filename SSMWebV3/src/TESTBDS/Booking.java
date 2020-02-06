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

public class Booking extends StringValues{
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
	public void loginTest() throws Exception {
		loginUser();
		System.out.println("Login - Test Pass");
	} 

	@Test
	public void Createbooking() throws Exception {
		loginUser();
		Thread.sleep(2000);
		bookclient();
		Thread.sleep(2000);
		SaveBTN();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (driver.getPageSource().contains("Customer"))
		{
			System.out.println("Booking Client - Test Pass");
		}else {
			System.out.println("Booking Client - Test Failed");
		}
	}
	@Test 
	public void Cancelbooking() throws Exception {
		loginUser();
		Thread.sleep(2000);
		bookclient();
		Thread.sleep(2000);
		CancelBTN();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (driver.getPageSource().contains("Customer"))
		{
			System.out.println("Booking Client - Test Pass");
		}else {
			System.out.println("Booking Client - Test Failed");
		}
	}
	
	@Test 
	public void MissingCargotype() throws Exception {
	loginUser();
	Thread.sleep(2000);
	Missingcargo();
	SaveBTN();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	if (driver.getPageSource().contains("Vehicle load is required"))
	{
		System.out.println("Missing Cago Type - Test Pass");
	}else {
		System.out.println("Missing Cago Type  - Test Failed");
	}
}
	
	@Test 
	public void Missingroute() throws Exception {
	loginUser();
	Thread.sleep(2000);
	MissingRoute();
	Thread.sleep(2000);
	driver.findElement(By.xpath(Routefd)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
	SaveBTN();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	if (driver.getPageSource().contains("Route is required"))
	{
		System.out.println("Missing Route - Test Pass");
	}else {
		System.out.println("Missing Route  - Test Failed");
	}
	Thread.sleep(3000);
}
	@Test 
	public void Missingvehicle() throws Exception {
	loginUser();
	Thread.sleep(2000);
	MissingVehicle();
	Thread.sleep(2000);
	driver.findElement(By.xpath(vehiclefd)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
	Thread.sleep(5000);
	SaveBTN();
	
	if (driver.getPageSource().contains("Customer"))
	{
		System.out.println("Vehicle - Test Pass");
	}else {
		System.out.println("Vehicle  - Test Failed");
		Thread.sleep(3000);
	}
}
	//Other Scenario
	@Test 
	public void FilterusingStatus() throws Exception {
	loginUser();
	Thread.sleep(2000);
	
	
	}


//Login user
	private void loginUser() {

		driver.findElement(By.xpath(Usernamefd)).sendKeys(AuthUsername);
		driver.findElement(By.xpath(Passwordfield)).click();
		driver.findElement(By.xpath(Passwordfield)).sendKeys(AuthPassword);
		driver.findElement(By.xpath(Loginbtn)).click();
	}
//Book client
	private void bookclient() throws Exception {
		driver.findElement(By.linkText(Addbookingbtn)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Customerfd)).click(); 
		int i;

		for ( i=1; i<5; i++) {
			driver.findElement(By.xpath(Customerfd)
					).sendKeys(Keys.ARROW_DOWN);

			if(i == 4){
				driver.findElement(By.xpath(Customerfd
						)).sendKeys(Keys.ENTER);}}
		Thread.sleep(3000);
		driver.findElement(By.xpath(Cargofd)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Cargofd)).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath( Cargoquantityfd)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
		Thread.sleep(1000);
		driver.findElement(By.xpath( Cargoquantityfd)).sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);
		driver.findElement(By.xpath(Cquantityuomfd)).click();
		driver.findElement(By.xpath(Cquantityuomfd)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(Cquantityuomfd)).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Cargototalweightfd)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Cargototalweightfd)).sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);
		driver.findElement(By.xpath(Ctotaluomfd)).click();
		driver.findElement(By.xpath(Ctotaluomfd)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(Ctotaluomfd)).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Routefd)).click();
		driver.findElement(By.xpath(Routefd)).sendKeys(Keys.ARROW_UP,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(pickupdate)).sendKeys(RandomStringUtils.randomNumeric(4)+ "2020");
		Thread.sleep(2000);
		driver.findElement(By.xpath(dropoffdate)).sendKeys(RandomStringUtils.randomNumeric(4)+ "2020");
		Thread.sleep(2000);
		driver.findElement(By.xpath(vehiclefd)).click(); 
		int x;

		for ( x=0; x<5; x++) {
			driver.findElement(By.xpath(vehiclefd)
					).sendKeys(Keys.ARROW_DOWN);

			if(x == 3){
				driver.findElement(By.xpath(vehiclefd
						)).sendKeys(Keys.ENTER);}}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
//Missing cargo Type	
	private void Missingcargo() throws Exception {
			driver.findElement(By.linkText(Addbookingbtn)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(Customerfd)).click(); 
			int i;

			for ( i=1; i<5; i++) {
				driver.findElement(By.xpath(Customerfd)
						).sendKeys(Keys.ARROW_DOWN);

				if(i == 4){
					driver.findElement(By.xpath(Customerfd
							)).sendKeys(Keys.ENTER);}}
			Thread.sleep(1000);
			driver.findElement(By.xpath(Routefd)).click();
			driver.findElement(By.xpath(Routefd)).sendKeys(Keys.ARROW_UP,Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath(pickupdate)).sendKeys(RandomStringUtils.randomNumeric(4)+ "2020");
			Thread.sleep(2000);
			driver.findElement(By.xpath(dropoffdate)).sendKeys(RandomStringUtils.randomNumeric(4)+ "2020");
			Thread.sleep(2000);
			driver.findElement(By.xpath(vehiclefd)).click(); 
			int x;

			for ( x=0; x<5; x++) {
				driver.findElement(By.xpath(vehiclefd)
						).sendKeys(Keys.ARROW_DOWN);

				if(x == 3){
					driver.findElement(By.xpath(vehiclefd
							)).sendKeys(Keys.ENTER);}}
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
//Missing Route	
	private void MissingRoute() throws Exception {
		driver.findElement(By.linkText(Addbookingbtn)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Customerfd)).click(); 
		int i;

		for ( i=1; i<5; i++) {
			driver.findElement(By.xpath(Customerfd)
					).sendKeys(Keys.ARROW_DOWN);

			if(i == 4){
				driver.findElement(By.xpath(Customerfd
						)).sendKeys(Keys.ENTER);}}
		Thread.sleep(3000);
		driver.findElement(By.xpath(Cargofd)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Cargofd)).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath( Cargoquantityfd)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
		Thread.sleep(1000);
		driver.findElement(By.xpath( Cargoquantityfd)).sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);
		driver.findElement(By.xpath(Cquantityuomfd)).click();
		driver.findElement(By.xpath(Cquantityuomfd)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(Cquantityuomfd)).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Cargototalweightfd)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Cargototalweightfd)).sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);
		driver.findElement(By.xpath(Ctotaluomfd)).click();
		driver.findElement(By.xpath(Ctotaluomfd)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(Ctotaluomfd)).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(vehiclefd)).click(); 
		int x;

		for ( x=0; x<5; x++) {
			driver.findElement(By.xpath(vehiclefd)
					).sendKeys(Keys.ARROW_DOWN);

			if(x == 3){
				driver.findElement(By.xpath(vehiclefd
						)).sendKeys(Keys.ENTER);}}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
//Missing Vehicle	
	private void MissingVehicle() throws Exception {
		driver.findElement(By.linkText(Addbookingbtn)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Customerfd)).click(); 
		int i;

		for ( i=1; i<5; i++) {
			driver.findElement(By.xpath(Customerfd)
					).sendKeys(Keys.ARROW_DOWN);

			if(i == 4){
				driver.findElement(By.xpath(Customerfd
						)).sendKeys(Keys.ENTER);}}
		Thread.sleep(3000);
		driver.findElement(By.xpath(Cargofd)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Cargofd)).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath( Cargoquantityfd)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
		Thread.sleep(1000);
		driver.findElement(By.xpath( Cargoquantityfd)).sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);
		driver.findElement(By.xpath(Cquantityuomfd)).click();
		driver.findElement(By.xpath(Cquantityuomfd)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(Cquantityuomfd)).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Cargototalweightfd)).sendKeys(Keys.CONTROL,"a", Keys.BACK_SPACE);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Cargototalweightfd)).sendKeys(RandomStringUtils.randomNumeric(4));
		Thread.sleep(2000);
		driver.findElement(By.xpath(Ctotaluomfd)).click();
		driver.findElement(By.xpath(Ctotaluomfd)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(Ctotaluomfd)).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Routefd)).click();
		driver.findElement(By.xpath(Routefd)).sendKeys(Keys.ARROW_UP,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(pickupdate)).sendKeys(RandomStringUtils.randomNumeric(4)+ "2020");
		Thread.sleep(2000);
		driver.findElement(By.xpath(dropoffdate)).sendKeys(RandomStringUtils.randomNumeric(4)+ "2020");
		Thread.sleep(2000);
		
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


