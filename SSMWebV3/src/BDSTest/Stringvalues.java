package BDSTest;

import org.apache.commons.lang3.RandomStringUtils;

public class Stringvalues {
	
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
		protected String Customerfd="f_74360db0-293a-5b37-7160-e2d81e1d692d";
		protected String Addbookingbtn="//div[contains(text(),'ADD BOOKING')]";

}

