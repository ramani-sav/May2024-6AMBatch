package org.wipro.auto.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.auto.fb.utilitiespkg.ReadPropFile;

public class LoginPage 
{

	//because "this.driver" is null
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}


	
	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropFile.readelement("fb_login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("fb_login_password_name"))).sendKeys(pass);
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("fb_login_loginbttn_name"))).click();
	}
	
}
