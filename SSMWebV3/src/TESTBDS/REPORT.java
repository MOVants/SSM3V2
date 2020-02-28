package TESTBDS;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class REPORT extends StringValues { 
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
//CustomerReport
	@Test
	public void Generatecustomersummarry() throws Exception {
		loginUser();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Reportbtn)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Customerbtn)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Customersummary)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Startdate)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(chevron)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click(); //01/01/2020 
		Thread.sleep(1000);	
		driver.findElement(By.xpath(close)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Generate)).click();
		Thread.sleep(10000);	
	}
	@Test
	public void Generatecustomerdeatiled() throws Exception {
		loginUser();
		Thread.sleep(3000);	
		driver.findElement(By.xpath(Reportbtn)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Customerbtn)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Customerdetailed)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Inputcustomer)).click();
		driver.findElement(By.xpath(Inputcustomer)).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Startdate)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(chevron)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click(); //01/01/2020 
		Thread.sleep(1000);	
		driver.findElement(By.xpath(close)).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath(Filterdr)).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath(Generate2)).click();
		Thread.sleep(10000);
	}
	@Test
	public void GeneratecustomerdeatiledfilterDR() throws Exception {
		loginUser();
		Thread.sleep(3000);	
		driver.findElement(By.xpath(Reportbtn)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Customerbtn)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Customerdetailed)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Inputcustomer)).click();
		driver.findElement(By.xpath(Inputcustomer)).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Startdate)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(chevron)).click();
		driver.findElement(By.xpath(chevron)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click(); //01/01/2020 
		Thread.sleep(1000);	
		driver.findElement(By.xpath(close)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Filterdr)).click();
		driver.findElement(By.xpath(Filterdr)).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Generate2)).click();
		Thread.sleep(10000);
	}
	@Test
	public void GeneratecustomerdeatiledfilterNoDR() throws Exception {
		loginUser();
		Thread.sleep(3000);	
		driver.findElement(By.xpath(Reportbtn)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Customerbtn)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Customerdetailed)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Inputcustomer)).click();
		driver.findElement(By.xpath(Inputcustomer)).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Startdate)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(chevron)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click(); //01/01/2020 
		Thread.sleep(1000);	
		driver.findElement(By.xpath(close)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Filterdr)).click();
		driver.findElement(By.xpath(Filterdr)).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Generate2)).click();
		Thread.sleep(10000);
	}
	
	
	
//Driver Report
	@Test
	public void Generatedriversummarry() throws Exception {
		loginUser();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Reportbtn)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Driverbtn)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Driversummary)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Startdate)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(chevron)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click(); //01/01/2020 
		Thread.sleep(1000);	
		driver.findElement(By.xpath(close)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Generate)).click();
		Thread.sleep(10000);	
	}
	@Test
	public void Generatedriverdetailed() throws Exception {
		loginUser();
		Thread.sleep(3000);	
		driver.findElement(By.xpath(Reportbtn)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Driverbtn)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(Driverdetailed)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(Startdate)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(chevron)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click(); //01/01/2020 
		Thread.sleep(1000);	
		driver.findElement(By.xpath(close)).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath(Filterdr)).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath(Generate2)).click();
		Thread.sleep(10000);
	}
	@Test
	public void GeneratedriverdetailedFilterNoDR() throws Exception {
		loginUser();
		Thread.sleep(3000);	
		driver.findElement(By.xpath(Reportbtn)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Driverbtn)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(Driverdetailed)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(Startdate)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(chevron)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click(); //01/01/2020 
		Thread.sleep(1000);	
		driver.findElement(By.xpath(close)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Filterdr)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Filterdr)).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Generate2)).click();
		Thread.sleep(10000);
	}
	@Test
	public void GeneratedriverdetailedFilterDR() throws Exception {
		loginUser();
		Thread.sleep(3000);	
		driver.findElement(By.xpath(Reportbtn)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Driverbtn)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(Driverdetailed)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(Startdate)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(chevron)).click();
		driver.findElement(By.xpath(chevron)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click(); //01/01/2020 
		Thread.sleep(1000);	
		driver.findElement(By.xpath(close)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Filterdr)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Filterdr)).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Generate2)).click();
		Thread.sleep(10000);
	}
//Vehicle Report
	@Test
	public void VehiclesummarryReport() throws Exception {
		loginUser();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Reportbtn)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(VehicleBTN)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Vehiclesummary)).click(); 
		Thread.sleep(2000);
	//to set vehicle type
		//driver.findElement(By.xpath(Vehicletype)).click(); 
		driver.findElement(By.xpath(Startdate)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(chevron)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click(); //01/01/2020 
		Thread.sleep(1000);	
		driver.findElement(By.xpath(close)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Generate3)).click();
		Thread.sleep(10000);	
	}
	@Test
	public void VehicledetailedReport() throws Exception {
		loginUser();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Reportbtn)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(VehicleBTN)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Vehicledetailed)).click(); 
		Thread.sleep(2000);
	//to set vehicle type
		//driver.findElement(By.xpath(Vehicletype)).click(); 
	//to set plate Number
		////driver.findElement(By.xpath(Platenum)).click(); 
		driver.findElement(By.xpath(Startdate)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(chevron)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click(); //01/01/2020 
		Thread.sleep(1000);	
		driver.findElement(By.xpath(close)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Generate3)).click();
		Thread.sleep(10000);	
	}
	@Test
	public void VehicledetailedReportFilterDR() throws Exception {
		loginUser();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Reportbtn)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(VehicleBTN)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Vehicledetailed)).click(); 
		Thread.sleep(2000);
	//to set vehicle type
		//driver.findElement(By.xpath(Vehicletype)).click(); 
	//to set plate Number
		////driver.findElement(By.xpath(Platenum)).click(); 
		driver.findElement(By.xpath(Startdate)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(chevron)).click();
		driver.findElement(By.xpath(chevron)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click(); //01/01/2020 
		Thread.sleep(1000);	
		driver.findElement(By.xpath(close)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Filterdr)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Filterdr)).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Generate3)).click();
		Thread.sleep(10000);	
	}
	@Test
	public void VehicledetailedReportNoDR() throws Exception {
		loginUser();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Reportbtn)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(VehicleBTN)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Vehicledetailed)).click(); 
		Thread.sleep(2000);
	//to set vehicle type
		//driver.findElement(By.xpath(Vehicletype)).click(); 
	//to set plate Number
		////driver.findElement(By.xpath(Platenum)).click(); 
		driver.findElement(By.xpath(Startdate)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(chevron)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click(); //01/01/2020 
		Thread.sleep(1000);	
		driver.findElement(By.xpath(close)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Filterdr)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Filterdr)).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Generate3)).click();
		Thread.sleep(10000);	
	}
//Vehicle vacancy report
	@Test
	public void VacancysummarryReport() throws Exception {
		loginUser();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Reportbtn)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(VehicleBTN)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Vacancysummary)).click(); 
		Thread.sleep(2000);
	//to set vehicle type
		//driver.findElement(By.xpath(Vehicletype)).click(); 
		driver.findElement(By.xpath(Startdate)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(chevron)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click(); //01/01/2020 
		Thread.sleep(1000);	
		driver.findElement(By.xpath(close)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Generate4)).click();
		Thread.sleep(10000);	
	}
	@Test
	public void VacancydetailedReport() throws Exception {
		loginUser();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Reportbtn)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(VehicleBTN)).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(Vacancydetailed)).click(); 
		Thread.sleep(2000);
	//to set plate number
		//driver.findElement(By.xpath(Platenumber)).click(); 
		driver.findElement(By.xpath(Startdate)).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath(chevron)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click(); //01/01/2020 
		Thread.sleep(1000);	
		driver.findElement(By.xpath(close)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Generate4)).click();
		Thread.sleep(10000);	
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


