package org.xyz.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BrowserControl 
{

	WebDriver driver;
	
	@Test
	public void launchBrowser() throws Exception
	{
		
		driver= new ChromeDriver();
		
		//driver.get("https://www.google.com/");  //60 secs
		
		//Thread.sleep(5000);
		
		driver.navigate().to("https://thetestingworld.com/testings/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		/*
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		*/
		
		driver.findElement(By.name("fld_username")).sendKeys("user1");
		driver.findElement(By.name("fld_username")).clear();
		driver.findElement(By.name("fld_username")).sendKeys("user2");
		
		driver.findElement(By.cssSelector("[value='office']")).click();
		
		Select gender = new Select(driver.findElement(By.name("sex")));
		//gender.selectByIndex(2);  //female
		//gender.selectByValue("1"); //male
		
		gender.selectByVisibleText("Female");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		//con.selectByVisibleText("India");
		//con.selectByVisibleText("United Kingdom");
		//con.deselectAll();
		//con.deselectByVisibleText("United Kingdom");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Arizona"));
		
		st.selectByVisibleText("California");
		
		Select ct = new Select(driver.findElement(By.name("city")));
		ct.selectByVisibleText("California City");
		
		WebElement abc = driver.findElement(By.name("terms"));
		
		abc.click();
		
		//driver.findElement(By.className("displayPopup")).click();
		
		//driver.findElement(By.className("close")).click();
		
	}
	
	
	
}
