package org.wipro.auto.fb.datageneratorpkg;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{

	@DataProvider(name="setofdata")
	public Object[][] testdata1()
	{
		
		Object[][] data2 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-dimensional array
		return data2;
	}
	
	
	@DataProvider(name="dob")
	public Object[][] testdata2()
	{
		
		Object[][] data2 = {{"18","Jul"},{"8","Apr"},{"17","May"}};  //2-dimensional array
		return data2;
	}
	
	

	@DataProvider(name="setofdata")
	public Object[][] testdata3()
	{
		
		Object[][] data3 = {{"fname1","lname2"},{"fname2","lname2"},{"fname3","lname3"}};  //2-dimensional array
		return data3;
	}


	
	
}
