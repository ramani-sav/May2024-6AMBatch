package org.xyz.automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HandlingKeyboardMouse 
{

	WebDriver driver;
	
	
	@Test
	public void handleFrames() throws Exception
	{
			
			driver= new ChromeDriver();
			
			driver.get("https://demoqa.com/frames");
			
			System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe')]")).getText());
			
			driver.switchTo().frame("frame1");
			
			System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());
			
			CaptureScreenshot.testresults(driver,"handleFrames");
	}
	
	
	@Test
	public void handleAlerts() throws Exception
	{
			
			driver= new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			driver.findElement(By.className("signinbtn")).click();
			
			driver.switchTo().alert().accept();
			
			CaptureScreenshot.testresults(driver,"handleAlerts");
			
	}
	
	
	@Test(enabled=false)
	public void handleMouse()
	{
			
			driver= new ChromeDriver();
			driver.get("https://www.mphasis.com/home.html");
			
			Actions act = new Actions(driver);
			
			//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
			//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
			
			//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
			
			act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
			//act.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).perform();
		
			act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).keyUp(Keys.CONTROL).perform();
			
			Set<String> windid = driver.getWindowHandles();
			System.out.println(windid);
			
			Iterator<String> itr = windid.iterator();
			String wind1 = itr.next();  //first window
			String wind2 = itr.next();  //second window
			String wind3 = itr.next();  //second window
			
			driver.switchTo().window(wind2);
			driver.switchTo().window(wind1);
			driver.switchTo().window(wind3);
	}
	
	@Test(enabled=false)
	public void handleKeyboard() throws Exception
	{
		
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		
		/*
		act.sendKeys("1234@gmail.com").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		act.sendKeys("user2").perform();
		
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("pass1234").perform();
		act.sendKeys(Keys.ENTER).perform();
		*/
	}
	
	
	
}
