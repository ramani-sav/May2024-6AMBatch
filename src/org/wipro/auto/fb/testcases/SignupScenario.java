package org.wipro.auto.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.fb.basepkg.InitiateBrowser;
import org.wipro.auto.fb.datageneratorpkg.TestDataGenerator;
import org.wipro.auto.fb.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test(dataProvider="dob",dataProviderClass=TestDataGenerator.class)
	public void tc02_validateSignupvalidation(String day, String month) throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		//Test Case:::
		sign.click_createnewaccountbttn();
		sign.enter_firstname("Selenium");
		sign.enter_lastname("Smith");
		sign.enter_mobile_email("abc@gmail.com");
		
		sign.select_dob_day("18");//
		sign.select_dob_day(day);
		sign.select_dob_month("July");//
		sign.select_dob_month(month);
		sign.select_dob_year("2010");
		sign.click_gender_male();
		sign.click_signupbttn();
		
		
	}
	
}
