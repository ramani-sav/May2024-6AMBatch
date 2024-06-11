package firstPkg;

public class Class2 
{
	static int a = 20;

	public static void callMeth()
	{
		
		System.out.println(a);
		System.out.println("this is method with static keyword");
	}
	
	public void methodwithoyutstatic()
	{
		System.out.println("this method is without static");
	}
	
	public static void main(String[] args) 
	{
	
		Class2 c2 = new Class2();
		c2.methodwithoyutstatic();
		
		Class2.callMeth();
		
	}
	
}
