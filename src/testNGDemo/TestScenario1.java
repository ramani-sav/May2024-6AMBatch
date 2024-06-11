package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario1
{

	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("this is first test case");
		Assert.assertEquals("hello", "hello1");
		
		//System.out.println("this got failed");
	}
	
	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is third test case");
	}
	
	@Test(priority=0)
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
	}
	
	@Test(priority=-1)
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
	}
	
	@Test(priority=-2)
	public void sixth_testcase()
	{
		System.out.println("this is sixth test case");
	}
	
	
	
}
