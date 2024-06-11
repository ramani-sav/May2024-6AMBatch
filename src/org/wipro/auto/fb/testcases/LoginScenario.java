package org.wipro.auto.fb.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.wipro.auto.fb.basepkg.InitiateBrowser;
import org.wipro.auto.fb.pages.LoginPage;
import org.wipro.auto.fb.utilitiespkg.ReadPropFile;

public class LoginScenario extends InitiateBrowser
{

	@Test
	public void tc01_validateloginfunc() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("user1");
		login.enter_password("pass1234");
		login.click_loginbttn();
	}
	
	
	
}
