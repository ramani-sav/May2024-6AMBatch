package org.wipro.auto.fb.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.auto.fb.pages.SignupPage;
import org.wipro.auto.fb.basepkg.InitiateBrowser;
import org.wipro.auto.fb.datageneratorpkg.TestDataGenerator;
//import org.wipro.auto.fb.datageneratorpkg.TestDataGenerator;
//import org.wipro.auto.fb.pages.LoginPage;
import org.wipro.auto.fb.pages.SignupPage;
//import org.wipro.auto.fb.utilitiespkg.ReadPropFile;

public class SignupScenario_DDF2 extends InitiateBrowser
{

	@Test(dataProvider="dob",dataProviderClass=TestDataGenerator.class)
	public void tc02_validatelSignupvalidation(String day, String month) throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccountbttn();
		sign.enter_firstname("Selenium");
		sign.enter_lastname("Smith");
		sign.enter_mobile_email("abc1@gmail.com");
		sign.click_signupbttn();
		sign.click_gender_male();
		sign.select_dob_day(day);
		sign.select_dob_month(month);
		sign.select_dob_year (day);
		
		
	}
		
	
}
