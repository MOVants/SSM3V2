package TESTBDS;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringValues {
	protected String randomAlphaNumChar = RandomStringUtils.randomAlphabetic(10);
	protected String randomAlphaChar = RandomStringUtils.randomAlphabetic(6);
	protected String randomNumChar = RandomStringUtils.randomAlphabetic(11);

	//Login
	protected String AuthUsername="rosbel.clc@gmail.com";
	protected String AuthPassword="admin0123";
	protected String Loginbtn="//button[@type='button']";
	protected String Usernamefd="//input[@type='text']";
	protected String Passwordfield="//input[@type='password'][@class='q-field__native q-placeholder']";

	//Booking
	protected String Customerfd="//div[@id='q-app']/div/div/main/div/div/div/div[2]/div/div/div/div/div/input";
	protected String Addbookingbtn="ADD BOOKING";//linkText
	//set cargo
	protected String Cargofd="//div[@id='q-app']/div/div/main/div[2]/div/div/div[2]/div/div/div/div/div/input";
	protected String Cargoquantityfd="//input[@type='number']";
	protected String Cquantityuomfd="//div[@id='q-app']/div/div/main/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div/input";
	protected String Cargototalweightfd="(//input[@type='number'])[3]";
	protected String Ctotaluomfd="//div[@id='q-app']/div/div/main/div[2]/div/div/div[2]/div[4]/div[2]/div/div/div/div/div/input";
	//set route
	protected String Routefd="//div[@id='q-app']/div/div/main/div[3]/div/div/div[2]/div/div/div/div/div/div/div/input";
	protected String pickupdate="(//input[@type='text'])[7]";
	protected String dropoffdate="(//input[@type='text'])[8]";
	//set vehicle
	protected String vehiclefd="//div[@id='q-app']/div/div/main/div[4]/div/div/div[2]/div/div/div/div/div/input";
	//Save
	protected String Savebtn="//text()[contains(.,'Save')]/ancestor::button[1]";
	//Cancel
	protected String Cancelbtn="//text()[contains(.,'Cancel')]/ancestor::a[1]";
	
//Hustling
	protected String Bookingbtn="//div[contains(text(),'Booking')]";
	protected String Hustlingbtn="//a[contains(text(),'Hustling')]";
	protected String Addhustlingbtn="//text()[.='ADD BOOKING']/ancestor::button[1]";
	protected String Selectcustomer="//input[@class='q-select__input q-placeholder col']";
	protected String Inputcargotype="//input[@type='text'][@class='q-field__native q-placeholder']";
	protected String inputunload="//div[@class='q-dialog fullscreen no-pointer-events']//div[3]//div[1]//div[1]//div[1]//input[1]";
	
//Customer
	protected String customerbtn="a[href='#/customer/list']";
	protected String Addcustomerbtn=" /html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]";
	protected String Companyname="/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]";
	protected String Customercode="/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]";
	protected String Personincharge="/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/input[1]";
	protected String Contactnumb="/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]";
	protected String Address="/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/input[1]";
	protected String EmailAdd="html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/input[1]";
	protected String CancelCustomer="//text()[.='Cancel']/ancestor::button[1]";

//Vehicle
	
	protected String Vehiclebtn="/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/a[3]";
	protected String All ="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]";
	protected String Available="/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]";
	protected String loading="/html[1]/body[1]/div[3]/div[5]/div[2]/div[1]";
	protected String loadingcomplete="/html[1]/body[1]/div[3]/div[6]/div[2]/div[1]";
	protected String Intransit="/html[1]/body[1]/div[3]/div[7]/div[2]/div[1]";
	protected String Maintenance="/html[1]/body[1]/div[3]/div[11]/div[2]/div[1]";

//MISC
	
	protected String MISCbtn="//div[contains(text(),'Misc')]";
	protected String Activitybtn="Activity";//linkText
	protected String Addactivity="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]";
	protected String Selectstatus="/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]";
	protected String Inputactivity="/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]";

//REPORTS
	protected String Reportbtn="//div[text()='Reports']";
/*CUSTOMER*/
	protected String Customerbtn="//div[@class='q-item__label'][contains(text(),'Customer')]";
	protected String Customersummary="//a[contains(text(),'Customers Summary Report')]";
	protected String Customerdetailedbtn="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/a[2]";
	//Date
	protected String Customerdetailed="//div[@class='q-expansion-item q-item-type q-expansion-item--expanded q-expansion-item--standard']//a[2]";
	protected String Startdate="//input[@type='text'][@class='q-field__native q-placeholder']";
	protected String Selectdate="//div[contains(text(),'16')]";//change date
	protected String Enddate="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]";
	protected String chevron="/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/div[2]/i[1]";
	protected String close="//text()[.='Close']/ancestor::button[1]";
	protected String Inputcustomer="//input[@class='q-select__input q-placeholder col']";
	protected String Filterdr="//text()[.='All']/ancestor::div[1]";
	
	/*DRIVER*/
	protected String Driverbtn="//div[@class='q-item__label'][contains(text(),'Driver')]";
	protected String Driversummary="//a[contains(text(),'Drivers Summary Report')]";
	protected String Driverdetailed="//a[contains(text(),'Driver Detailed')]";

	/*VEHICLE*/
	protected String VehicleBTN="//div[@class='q-item__label'][contains(text(),'Vehicle')]";
	protected String Vehiclesummary="//a[contains(text(),'Vehicles Summary Report')]";
	protected String Vehicledetailed="//a[contains(text(),'Vehicle Detailed')]";
	protected String Vacancysummary="//div[@class='q-menu scroll']//a[3]";
	protected String Vacancydetailed="//div[@class='q-menu scroll']//a[4]";
	protected String Vehicletype="//input[@class='q-select__input q-placeholder col']";
	protected String Platenum="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]";
	protected String Filter="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]";
	protected String Platenumber="";
	//GENERATE Customer
	protected String Generate2="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]";
	protected String Generate="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]";
	
//GENERATE Vehicle	
	protected String Generate3="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]";
	protected String Generate4="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]";
	/*
	
	protected String customerfd="";
	protected String customerfd="";
	protected String customerfd="";*/
	
	
	
	
	
		public StringValues() {
			super();
	}
}
