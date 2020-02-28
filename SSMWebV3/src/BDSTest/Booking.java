package BDSTest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Booking extends Stringvalues {

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
		Thread.sleep(3000);

		driver.findElement(By.xpath(Addbookingbtn)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='q-app']/div/div/main/div/div/div/div[2]/label/div/div/div/div/input" )).click();
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath("//div[@id='q-app']/div/div/main/div/div/div/div[2]/label/div/div/div/div/input"))).selectByVisibleText("CITY SQUARE");
		Thread.sleep(8000);
		
	}
  



	//Login user
	private void loginUser() {

		driver.findElement(By.xpath(Usernamefd)).sendKeys(AuthUsername);
		driver.findElement(By.xpath(Passwordfield)).click();
		driver.findElement(By.xpath(Passwordfield)).sendKeys(AuthPassword);
		driver.findElement(By.xpath(Loginbtn)).click();
	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
