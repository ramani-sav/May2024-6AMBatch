package org.xyz.automation;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot
{

	int a = 20;
	int b = 30;

	public static void testresults(WebDriver driver, String name) throws Exception
	{
		
		TakesScreenshot ts = (TakesScreenshot) driver;  //take the screenshot - prt sc
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./TestResultsSc/" + name + ".png");
		
		FileUtils.copyFile(f, fd);
		
	}
	
}
