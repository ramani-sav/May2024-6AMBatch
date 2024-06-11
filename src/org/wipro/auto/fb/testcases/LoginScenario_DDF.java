package org.wipro.auto.fb.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.auto.fb.basepkg.InitiateBrowser;
import org.wipro.auto.fb.datageneratorpkg.TestDataGenerator;
import org.wipro.auto.fb.pages.LoginPage;
import org.wipro.auto.fb.utilitiespkg.ReadPropFile;

public class LoginScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="setofdata",dataProviderClass=TestDataGenerator.class)
	public void tc01_validateloginfunc(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
	}
	

	
	
	
}
