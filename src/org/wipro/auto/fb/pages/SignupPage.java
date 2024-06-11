package org.wipro.auto.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.auto.fb.utilitiespkg.ReadPropFile;

public class SignupPage 
{

	//because "this.driver" is null 
	
	WebDriver driver;
	
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("fb_login_createnewaccount_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("fb_signup_firstname_name"))).sendKeys(fname);
	}
	
	
	public void enter_lastname(String lname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("fb_signup_lastname_name"))).sendKeys(lname);
	}
	
	
	public void select_dob_day(String day) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.name(ReadPropFile.readelement("fb_signup_dob_day_name"))));
		dob_day.selectByVisibleText("day");
	
	}
	
	
	public void select_dob_month(String month) throws Exception
	{
		Select dob_month  = new Select(driver.findElement(By.name(ReadPropFile.readelement("fb_signup_dob_month_name"))));
		dob_month.selectByVisibleText(month);
	
	}
	
	public void select_dob_year(String year) throws Exception
	{
		Select dob_year = new Select(driver.findElement(By.id(ReadPropFile.readelement("fb_signup_dob_year_id=year"))));
		dob_year.selectByVisibleText(year);
	
	}
	
	public void click_gender_male() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("fb_signup_male_xpath"))).click();
	}
	
	/*public void click_gender_female() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("fb_signup_female_xpath"))).click();
	}
	*/
	
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("fb_signup_signupbttn"))).click();
	}
	
	public void enter_mobile_email(String email) throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("fb_signup_mobile__email_xpath"))).sendKeys(email);
	}
	
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("fb_signup_new password_id"))).sendKeys(pass);
	}
	
	
	
	
	
	
}
