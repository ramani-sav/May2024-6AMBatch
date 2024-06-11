package org.xyz.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{

	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");  //60 secs
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	@AfterMethod
	public void closeBrwoser()
	{
		
		//driver.close();  //will close one window/tab at a time
		driver.quit();  //will close multiple window at a time
	}
	
	@Test
	public void loginfunc()
	{
		
		
		
		driver.findElement(By.id("email")).sendKeys("user1");
		
		
		
		driver.findElement(By.name("pass")).sendKeys("pass12234");
		
		//abc.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		driver.findElement(By.cssSelector("[data-testid= 'open-registration-form-button']")).click();
		driver.findElement(By.cssSelector("[role='button']")).click();
	}
	
	@Test(enabled=true)
	public void signupfunc() throws Exception
	{
		
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		driver.findElement(By.name("websubmit")).click();
	
		
	}
	
	
	
	
	
	
}
