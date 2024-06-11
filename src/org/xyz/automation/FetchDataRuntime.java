package org.xyz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRuntime 
{

	WebDriver driver;
	
	@Test
	public void facebook_loginPage() throws Exception
	{
		
		driver= new ChromeDriver();
		
		String ExpURL = "https://www.facebook.com";
		
		driver.get(ExpURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, ExpURL,"this URL is not matching");  //fail - hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL,"this URL is not matching"); 
		
		System.out.println("this test case got failed");
		
		String ExpTitle = "Facebook – log in or sign up";
		
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		Assert.assertEquals(ActTitle, ExpTitle);
		
		String Exp_Username_textbox = "Email address or phone number";
		
		String Act_username_textbox = driver.findElement(By.id("email")).getAttribute("placeholder");
		
		System.out.println(Act_username_textbox);
		
		Assert.assertEquals(Act_username_textbox, Exp_Username_textbox);
		
		String Exp_loginBttnText = "Log in";
				String Act_loginBttnText = driver.findElement(By.name("login")).getText();
		System.out.println(Act_loginBttnText);
		
		Assert.assertEquals(Act_loginBttnText, Exp_loginBttnText);
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).getText());
		
		Point login_loc = driver.findElement(By.name("login")).getLocation();
		System.out.println(login_loc);
		
		//System.out.println(driver.getPageSource());
		
		boolean logn_enabled = driver.findElement(By.name("login")).isEnabled();
		Assert.assertEquals(logn_enabled, true);
		
		//driver.findElement(By.cssSelector("[for='RememberLogin']")).isSelected();
		
		sa.assertAll();
		
	}
	
	
	
}
